package LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T>{

    private ArrayList<T> LibraryItems;

    public LibraryManager() {
        LibraryItems = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        if(LibraryItems.contains(item)){
            System.out.println("This item is already in the system");
        } else {
            LibraryItems.add(item);
        }
    }

    @Override
    public void removeItem(T item) {
//        for (int i = 0; i < LibraryItems.size(); i ++){
            if (LibraryItems.contains(item)){
                LibraryItems.remove(item);
            } else if (!LibraryItems.contains(item)){
                System.out.println("Item not found");


//            if (item.getTitle().equals(LibraryItems.get(i).getTitle())){
//                LibraryItems.remove(item);
//            } else {
//                System.out.println("Item not found");
//            }
        }
    }

    @Override
    public void displayItems() {
        for(int i = 0; i < LibraryItems.size(); i++){
            System.out.println(LibraryItems.get(i).getItemDetails());
        }
    }
}
