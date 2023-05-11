package ClassObjectConstructorsPractice;

public class ProductMain {
    public static void main(String[] args){
        Product buyProduct = new Product(10, 3, "Lunch");

        buyProduct.printProduct();
        buyProduct.totalCost();
    }
}

