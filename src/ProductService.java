import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p:products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public List<Product> getProductByPlace(String place){
        List<Product> placeList = new ArrayList<>();
        for(Product p: products){
            if(p.getPlace().equals(place)){
                placeList.add(p);
            }
        }
        return placeList;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> textProd = new ArrayList<>();

        for(Product p: products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str)){
                textProd.add(p);
            }
        }
        return textProd;
    }
}
