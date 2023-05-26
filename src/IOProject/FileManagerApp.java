package IOProject;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class FileManagerApp {
    public static void main(String[] args) {

////      Maybe delete next line
//        FileSystem fs = FileSystems.getDefault();
//        Path path = fs.getPath("src/IOProject");

//      Ask user for their desired directory path
        System.out.println("Enter the directory path that you would like to take: ");

//      Create scanner and store information into a String typed variable
        Scanner scanner = new Scanner(System.in);
        String userDirectory = scanner.nextLine();
        Path userPath = null;
//      Check to see if the directory path inputted exists
        try {
            userPath = Paths.get(userDirectory);
            if (!Files.isDirectory(userPath)) {
                System.out.println("Directory path now found. Please try again.");
                return;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            ;
        }

        boolean running = true;
//      if it does exist, print users options
        while (running) {
            System.out.println("Hello !");
            System.out.println("Welcome to the Main menu, what would you like to do today?");
            System.out.println("Enter 1 to view the contents of the directory.");
            System.out.println("Enter 2 to make a copy of a file.");
            System.out.println("Enter 3 to move a file.");
            System.out.println("Enter 4 to delete a file");
            System.out.println("Enter 5 to create a new directory.");
            System.out.println("Enter 6 to delete a directory.");
            System.out.println("Enter 7 to search for a file based on file name or extension.");
            System.out.println("Enter 0 to move a exit.");

            int optionSelected = Integer.valueOf(scanner.nextLine());

            switch (optionSelected) {
                case 1:
                    displayFileInformation(userPath);
                    break;
                case 2:
                    //      Creates a new file holding the information from the file we want to copy
                    System.out.println("Enter the file path of the file you wish to copy: ");
                    //      Save user input into a variable
                    String originalFilePath = scanner.nextLine();
                    //      Creates a new file to hold the copied
                    System.out.println("Enter a file path for the copied file: ");
                    //      Save user input into a variable
                    String copiedFilePath = scanner.nextLine();
                    //      Call function that does the copying of files
                    copyFile(originalFilePath, copiedFilePath);
//                    File originalFile = new File("src/PracticingIOBasics/randomtext.txt");
//                    File copied = new File ("src/IOProject/copyOfRandomText.txt");
                    break;
                case 3:
//                  Gets the path you want to move from
                    System.out.println("Enter the file path of the file you want to move: ");
                    String fileToMove = scanner.nextLine();
//        Path sourcePath = Paths.get("src/PracticingIOBasics/newRandomtext.txt");
//                  Creates the path you want to move to
                    System.out.println("Enter the file path of where you would like to move the file to: ");
                    String movedFile = scanner.nextLine();
//        Path targetPath = Paths.get("src/IOProject/copyOfNewRandomText.txt");
//                  Call function to move files
                    moveFile(fileToMove, movedFile);
                    break;
                case 4:
//                  Gets the path of the file to delete
                    System.out.println("Enter the file path of the file you wish to delete: ");
                    String fileToDelete = scanner.nextLine();

//                  Call function to delete
                    deleteFile(fileToDelete);
                    break;
                case 5:
//                  Gets the path of the new directory
                    System.out.println("Enter the path of the new directory: ");
                    String newDirectoryPath = scanner.nextLine();

//                  Call function to create directory
                    createDirectory(newDirectoryPath);
                    break;
                case 6:
//                  Gets the path of the directory to delete
                    System.out.println("Enter the path of the directory you wish to delete: ");
                    String directoryToDelete = scanner.nextLine();

//                  Call function to create directory;
                    deleteDirectory(directoryToDelete);
                    break;
                case 7:
                    System.out.println("Enter the directory you would like to search in: ");
                    String searchDirectory = scanner.nextLine();

                    Path searchPath = Paths.get(searchDirectory);
//                    searchPath = Paths.get(userDirectory)
//                  Ask user for the file they're looking for
                    System.out.println("Enter file name OR file extension:");
//                  Saves user input into variable
                    String searchingFor = scanner.nextLine();

//                  Call search function
                    findFile(searchPath, searchingFor);
                    break;
                default:
                    System.out.println("Exiting the program. Goodbye.");
                    running = false;
                    break;

            }
        }
    }


    //  Code that allows you to loop through the files stored in the directory path
    public static void displayFileInformation(Path dirPath) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
            System.out.println("Files in Directory: ");
            for (Path child : stream) {
//        Display the contents of a specified directory, including file names, file sizes, and last modified dates
                BasicFileAttributes attributes = null;
                try {
                    attributes = Files.readAttributes(child, BasicFileAttributes.class);
                    System.out.println("File Name: " + child.getFileName());
                    System.out.println("Last Modified at: " + attributes.lastModifiedTime());
                    System.out.println("File size is: " + attributes.size());
                } catch (IOException e) {
                    System.err.println("IOException: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //  COPY
    public static void copyFile(String x, String y) {

//      Creates files from filepaths
        File originalFile = new File(x);
        File copiedFile = new File(y);

        try {
//          Copies the information from the original file to the copy of the original file.
            Files.copy(originalFile.toPath(), copiedFile.toPath());
            System.out.println("File copied successfully!");
        } catch (Exception e) {
            System.out.println("Error in copying file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //  MOVE FILE
    public static void moveFile(String x, String y) {
//      Gets the path you want to move from
        Path sourcePath = Paths.get(x);
//      Gets the path you want to move to
        Path targetPath = Paths.get(y);

//      Completes the move
        try {
            Files.move(sourcePath, targetPath);
            System.out.println("File moved successfully!");
        } catch (IOException ioe) {
            System.out.println("Error in moving file: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    //  DELETE FILE
    public static void deleteFile(String x) {

        Path deletePath = Paths.get(x);
        try {
            Files.delete(deletePath);
            System.out.println("File deleted successfully!");
        } catch (IOException ioe) {
            System.out.println("Error in deleting file: " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    //  CREATE DIRECTORY
    public static void createDirectory(String x) {
        Path newDir = Paths.get(x);
        try {
            Files.createDirectory(newDir);
            System.out.println("Directory created successfully!");
        } catch (IOException e) {
            System.out.println("Error in creating directory: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //  DELETE DIRECTORY
    public static void deleteDirectory(String x) {
        Path deleteDir = Paths.get(x);
        try {
            Files.delete(deleteDir);
            System.out.println("Directory deleted successfully!");
        } catch (IOException e) {
            System.out.println("Error in deleting directory: " + e.getMessage());
        }

    }

    //  Find file based on name
    public static void findFile(Path dirPath, String x) {
        boolean fileFound = false;
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)) {
                for (Path child : stream) {
                    if (child.getFileName().toString().endsWith(x)) {
                        System.out.println(child.getFileName());
                        fileFound = true;
                    } else if (child.getFileName().toString().toLowerCase().contains(x)) {
                        System.out.println(child.getFileName());
                        fileFound = true;
                    }
                }
                if(!fileFound){
                    System.out.println("File not found in this directory. Please try again.");
                }
        } catch (IOException ioe) {
            System.out.println("Error accessing directory: " + ioe.getMessage());
            ;
        }
    }
}


