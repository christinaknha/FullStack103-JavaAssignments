package TakingLibraryManagementFurther;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {
    List<Book> library;
    List<User> users;

    public Library() {
        library = new ArrayList<>();
        users = new ArrayList<>();
    }

    public List<Book> getLibrary() {
        return library;
    }

    public void addBook(Book book) {
//  add book to the library
        if (library.contains(book)) {
            System.out.println("This book is already in the system");
        } else {
            library.add(book);
        }
    }

    public void removeBook(String bookTitle) {
//  remove book from library based on title
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getTitle() == bookTitle) {
                library.remove(i);
            }
        }
    }

    //  Find all books published in a specific year
    public List<Book> yearPublished(int year) {
        Predicate<Book> matchingYear = book -> book.getPublicationYear() == year;
        List<Book> booksWithMatchingYears = library.stream()
                .filter(matchingYear)
                .collect(Collectors.toList());
        System.out.println(booksWithMatchingYears);
        return booksWithMatchingYears;
    }

    //  Find all books by a specific author
    public List<Book> findAuthor(String name) {
        Predicate<Book> matchingAuthor = book -> book.getAuthor().toLowerCase().equals(name.toLowerCase());
        List<Book> booksWithMatchingAuthors = library.stream()
                .filter(matchingAuthor)
                .collect(Collectors.toList());
        System.out.println(booksWithMatchingAuthors);
        return booksWithMatchingAuthors;
    }

    //  Find book with most pages
    public Optional<Book> maxPages() {
        Optional<Book> longestBook = library.stream()
                .max(Comparator.comparing(Book::getPages));
        System.out.println(longestBook);
        return longestBook;
    }

    //  Find all books with more than n pages
    public List<Book> longerThan(int n) {
        Predicate<Book> moreThanNPages = book -> book.getPages() > n;
        List<Book> booksWithMorePages = library.stream()
                .filter(moreThanNPages)
                .collect(Collectors.toList());
        System.out.println(booksWithMorePages);
        return booksWithMorePages;
    }

    //      Print all book titles sorted alphabetically
    public void alphabetical() {
        List<Book> listedAlpha = library.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
        System.out.println(listedAlpha);
    }

    //  Add functionality to find all books in a specific category
    public List<Book> sortedCategory(String category) {
        Predicate<Book> matchingCategory = book -> book.getCategory().toLowerCase().equals(category.toLowerCase());
        List<Book> booksWithMatchingCategory = library.stream()
                .filter(matchingCategory)
                .collect(Collectors.toList());
        System.out.println(booksWithMatchingCategory);
        return booksWithMatchingCategory;
    }

    //  Function to check out books to users & adds it to their personal book list
    public void checkout(Book book, User user) {
        Predicate<Book> bookInSystem = bookToCheckOut -> bookToCheckOut.equals(book);
        boolean checkoutBook = library.stream()
                .filter(bookInSystem)
                .anyMatch(Book::isOnLoan);
        System.out.println(checkoutBook);
        if (checkoutBook) {
            System.out.println("This book is unavailable for checkout.");
        } else {
            book.setOnLoan(true);
            user.getCheckedOut().add(book);
            System.out.println(book.getTitle() + " is checked out by " + user.getName());
        }
    }

    //  Function to return books from users and remove it from their book list.
    public void bookReturn(Book book, User user) {
        Predicate<Book> bookInSystem = bookToCheckOut -> bookToCheckOut.equals(book);
        boolean bookToReturn = library.stream()
                .filter(bookInSystem)
                .anyMatch(Book::isOnLoan);
        if (bookToReturn) {
            book.setOnLoan(false);
            user.getCheckedOut().remove(book);
            System.out.println(book.getTitle() + " has been returned by " + user.getName());
        } else {
            System.out.println("This book is not currently checked out.");
        }
    }

    //  Function to calculate late fees
    public double lateFees(String title, User user) {
        boolean hasBook = false;
        int daysOut;
        double totalFee = 0;
        for (int i = 0; i < user.getCheckedOut().size(); i++) {
            if (library.get(i).getTitle() == title) {
                System.out.println("User has this book checked out.");
                hasBook = true;
                if (hasBook) {

                    for (int j = 0; j < user.getCheckedOut().size(); j++) {
                        daysOut = user.getCheckedOut().get(j).getDaysOnLoan();
                        if (daysOut > 14) {
                            daysOut = daysOut - 14;
                            totalFee = daysOut * 2.00;
                            System.out.println("Book is over due by " + daysOut + ". User owes " + totalFee);
                        } else {
                            System.out.println("Book was returned on time.");
                        }
                    }
                }
            } else {
                System.out.println("User does not have book checked out.");
                hasBook = false;
            }
        }
        return totalFee;


    }

    public void addUser(User user) {
        users.add(user);
    }

    public static void main(String[] args) {
        Library myLibrary = new Library();
        Book book = new Book("Don't Blink", "James Patterson", 2002, 464, "mystery", false);
        Book book1 = new Book("Sarah's Key", "Tatiana de Rosnay", 2007, 294, "historical fiction", true);
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1998, 375, "fantasy", false);
        Book book3 = new Book("Words I'll Never Say", "Christina Ha", 2021, 600, "poetry", false);
        myLibrary.addBook(book);
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        User user = new User("Christina", 1);
        System.out.println(myLibrary.getLibrary());

//      Remove book based on Title
        myLibrary.removeBook("Words I'll Never Say");
//      Filter books based on year published
        myLibrary.yearPublished(1998);
//      Filter books based on author
        myLibrary.findAuthor("James Patterson");
//      Filter book on most pages
        myLibrary.maxPages();
//      Filter book on more than n number of pages
        myLibrary.longerThan(300);
//      Sort books alphabetically
        myLibrary.alphabetical();
//      Sort books by genre
        myLibrary.sortedCategory("historical fiction");
//      Check out book to user
        myLibrary.checkout(book, user);
        myLibrary.checkout(book2, user);
        System.out.println(user.getCheckedOut());
//      let user return book
        myLibrary.bookReturn(book2, user);

//      Sets number of days book has been on loan
        book.setDaysOnLoan(20);
        myLibrary.lateFees(book.getTitle(), user);


    }
}
