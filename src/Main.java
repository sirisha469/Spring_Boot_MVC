import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ProductService service = new ProductService();

        //add the products
        //Product p = new Product("Asus Vivobook", "Laptop", "Brown table", 2022);
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2025));
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2023));
        service.addProduct(new Product("Focussrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2023));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2024));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2023));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2025));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2023));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2025));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2024));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2025));

        List<Product> products = service.getAllProducts();
        for(Product p : products){
            System.out.println(p);
        }

        System.out.println("=================================================");

        System.out.println("A particular product");

        Product particular = service.getProduct("Apple Mouse");
        System.out.println(particular);
    }
}