package HashMapPracticeProblems;
import java.util.HashMap;

public class Program {
    private String abbreviation;
    private String explanation;

    public Program(String abbreviation, String explanation){
        this.abbreviation = abbreviation;
        this.explanation = explanation;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

    public String getExplanation(){
        return this.explanation;
    }

    //  Prints all keys given in the hashmap given as a parameter
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String items : hashmap.keySet()) {
            System.out.println(items);
        }
    }

    //  prints keys in hashmap given as a parameter which contain the string given as a parameter
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String items : hashmap.keySet()) {
            if (items.contains(text)) {
                System.out.println(items);
            }
        }
    }


//  prints values of given hashmap which keys contain the given string.
        public static void printValuesOfKeysWhere (HashMap < String, String > hashmap, String text){
            for (String items : hashmap.keySet()) {
                if (items.contains(text)) {
                    System.out.println(hashmap.get(items));
                }
            }
        }

//        prints all values in hashmap given as parameter using toString method of Book Objects
        public static void printValues(HashMap<String,Book> hashmap){
            for (Book book : hashmap.values()) {
                    System.out.println(book);
                }
        }

//        prints only books in the given hashmap which contains the given string. Find name of book with the method getName
        public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
            for (Book book : hashmap.values()) {
                if (book.getName().contains(text)) {
                    System.out.println(book);
                }
            }
        }

        public static void main (String[] args){
            HashMap<String, String> hashmap = new HashMap<>();
            hashmap.put("f.e", "for example");
            hashmap.put("etc.", "and so on");
            hashmap.put("i.e", "more precisely");

            printKeys(hashmap);
            System.out.println("---");
            printKeysWhere(hashmap, "i");
            System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

            HashMap<String, Book> hashmapBook = new HashMap<>();
            hashmapBook.put("sense", new Book("Sense and Sensibility", 1811, "..."));
            hashmapBook.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

            printValues(hashmapBook);
            System.out.println("---");
            printValueIfNameContains(hashmapBook, "prejud");
        }

    }

