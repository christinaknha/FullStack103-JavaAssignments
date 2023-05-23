package TakingLibraryManagementFurther;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int libraryCardNumber;
    private List<Book> checkedOut;

    public User(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this. checkedOut = new ArrayList<>();
    }

    public List<Book> getCheckedOut() {
        return checkedOut;
    }

    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }


}
