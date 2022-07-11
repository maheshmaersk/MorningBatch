package test;

public class ProductDetails extends CoreProduct {

    public static void main(String[] args) {

        ProductDetails obj = new ProductDetails();
        obj.getProductImage();
        obj.getProductDescription();



        obj.getProductDetails("Hello",7);

//        obj.getProductImage();
    }


    void getProductDetails() {
        System.out.println("I am Oil");
    }

    void getProductDetails(String name) {
        System.out.println("I am Castor Oil Costing 234");
    }

    void getProductDetails(int id) {
        System.out.println("I am Castor Oil Costing 234");
    }

    void getProductDetails(String name,int id) {
        System.out.println("I am Castor Oil Costing 234");
    }


    void getProductDetails(int id,String name) {
        System.out.println("I am Castor Oil Costing 234");
    }

    void getProductImage() {
        System.out.println("I am Castor Oil");
    }

}
