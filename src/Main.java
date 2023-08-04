import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ProductService service = new ProductService();

        //add the products
        //Product p = new Product("Asus Vivobook", "Laptop", "Brown table", 2022);
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown table", 2022));

        List<Product> products = service.getAllProducts();
        for(Product p : products){
            System.out.println(p);
        }
    }
}