package OverloadingPractice;
import java.util.ArrayList;
import java.util.Scanner;

public class BookConstructorsMain {
    public static void main(String[] args){
//      Create scanner for user input
        Scanner scanner = new Scanner(System.in);

//      Create array to store user input
        ArrayList<BookConstructors> bookList = new ArrayList<>();

//      Create 3 books
        BookConstructors book1 = new BookConstructors("Sarah's Key" , 320, 2007);
        BookConstructors book2 = new BookConstructors("Fever 1793", 272, 2000);
        BookConstructors book3 = new BookConstructors("Cage the Animals at Night", 224, 1987);

//      Add books to bookList
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

//      books added using constructors
        bookList.add(new BookConstructors());
        bookList.add(new BookConstructors("Gone with the Wind"));
        bookList.add(new BookConstructors("Kiss the Girls", 464));
        bookList.add(new BookConstructors("Roses are Red", 464, 2000));

//      Print user instructions
        System.out.println("Answer the following questions. Enter a blank book title when you are done.");

        while (true) {

//          Ask user for title and store in variable
            System.out.println("Book title: ");
            String userTitle = scanner.nextLine();

//          if user enters blank title, break code
            if(userTitle.equals("")){
                break;
            }

//          Ask user for number of pages and store in variable
            System.out.println("Number of pages: ");
            int userNumPages = Integer.valueOf(scanner.nextLine());

//          Ask for publication date and store in variable
            System.out.println("Publication Year: ");
            int userYearPub = Integer.valueOf(scanner.nextLine());

//          Add new book to list
            bookList.add(new BookConstructors(userTitle, userNumPages, userYearPub));
        }

//      Ask what information user wants printed
        System.out.println("What information do you want to see?");
        System.out.println("Enter everything for all details or name for book titles only.");

//      Save user input into a variable
        String infoRequested = scanner.nextLine().toLowerCase();

        for (int i = 0; i < bookList.size(); i++){
            if (infoRequested.equals("everything")) {
                System.out.println("Title: "+ bookList.get(i).getTitle() + ", " + bookList.get(i).getAmountPages() + " pages, " +
                        "Published : " + bookList.get(i).getYearPublished());
            } else if (infoRequested.equals("name")){
                System.out.println("Title: " + bookList.get(i).getTitle());
            } else{
                System.out.println("Please enter either everything or name.");
            }
        }
    }
}
