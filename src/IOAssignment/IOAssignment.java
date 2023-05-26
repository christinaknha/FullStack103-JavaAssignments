package IOAssignment;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IOAssignment {
    public static void main (String[] args) {

//    Creates file paths for both input and output files
        String inputFilePath1 = "src/IOAssignment/input1.txt";
        String inputFilePath2 = "src/IOAssignment/input2.txt";
        String outputFilePath1 = "src/IOAssignment/merged.txt";
        String outputFilePath2 = "src/IOAssignment/sameNumbers.txt";

//    Creates an array to store numbers
        List<String> numbers = new ArrayList<>();


//      Reads all numbers and adds them to the array.
        try(BufferedReader reader1 = new BufferedReader(new FileReader(inputFilePath1));
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFilePath2))) {

            String line;
            while((line = reader1.readLine()) != null){
                try {
                    int inputFile1Numbers = Integer.parseInt(line);
                    numbers.add(line);
                }catch (NumberFormatException nfe){
                    System.out.println("Error: Please make sure all inputs are numbers.");
                    nfe.printStackTrace();
                }
            }

            while((line = reader2.readLine()) != null){
                try {
                    int inputFile2Numbers = Integer.parseInt(line);
                    numbers.add(line);
                }catch (NumberFormatException nfe){
                    System.out.println("Error: Please make sure all inputs are numbers.");
                    nfe.printStackTrace();
                }
            }



        } catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }

        System.out.println("Numbers: " + numbers);

//      Writes all numbers into a file.
        try{
            File outputFile1 = new File(outputFilePath1);
            if (outputFile1.createNewFile()){
                System.out.println("File created: " + outputFile1.getName());
            } else {
                System.out.println("File already exists. Will be updated.");
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile1));
            for (String allNumbers : numbers){
                writer.write(allNumbers);
                writer.newLine();
            }

            writer.close();
            System.out.println("Numbers written to the new file.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            File outputFile2 = new File(outputFilePath2);
            if (outputFile2.createNewFile()){
                System.out.println("File created: " + outputFile2.getName());
            } else {
                System.out.println("File already exists. Will be updated.");
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile2));

                Set<String> sameNums = numbers.stream()
                        .filter(number -> Collections.frequency(numbers ,number) > 1)
                        .collect(Collectors.toSet());
                writer.write(String.valueOf(sameNums));
                writer.newLine();

            writer.close();
            System.out.println("Numbers written to the new file.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
