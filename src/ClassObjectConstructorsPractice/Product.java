package ClassObjectConstructorsPractice;

public class Product {
    private double cost;
    private int quantity;
    private String name;

//  Create class constructor
    public Product(double productCost, int productQuantity, String productName){
        this.cost = productCost;
        this.quantity = productQuantity;
        this.name = productName;
    }

    public String totalCost(){
        double finalCost = this.cost * this.quantity;
        String message = "Total cost is: " + finalCost;
        System.out.println(message);
        return message;
    }
    public String printProduct(){
        String summary = this.name + " cost " + this.cost + " and " + this.quantity + " units were purchased.";
        System.out.println(summary);
        return summary;
    }
}
