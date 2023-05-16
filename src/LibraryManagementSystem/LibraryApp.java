package LibraryManagementSystem;

public class LibraryApp {
    public static void main(String[] args) {
//      Create array to store items
        LibraryManager<LibraryItem> itemList = new LibraryManager();

        itemList.addItem(new Book("Don't Blink", 2010, "James Patterson", "978-0316036236"));
        itemList.addItem(new Book("Sarah's Key", 2007, "Tatiana de Rosnay", "978-0312370848"));
        itemList.addItem(new Book("Harry Potter and the Chamber of Secrets", 1998, "J.K. Rowling", "978-0439064873"));

        itemList.addItem(new DVD("Aladdin", 1992, "Ron Clemets and John Musker", 90));
        itemList.addItem(new DVD("Mulan", 1998, "Tony Bancroft and Barry Cook", 88));
        DVD dvd3 = new DVD("The Lion King", 1994, "Roger Allers and Rob Minkoff", 88);

//        itemList.displayItems();
        itemList.addItem(new Book("Fever 1793", 2000, "Laurie Halse Anderson", "978-0689848919"));
        itemList.addItem(dvd3);
//        itemList.displayItems();
        itemList.removeItem(dvd3);
        itemList.displayItems();

    }
}
