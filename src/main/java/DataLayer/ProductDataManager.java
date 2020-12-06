
package DataLayer;

import BusinessLayer.Product;
import java.util.ArrayList;

public class ProductDataManager {
    
    private ArrayList<Product> products;
    
    public ProductDataManager() {
        this.products = new ArrayList<Product>();
    }
    
    public Product create(Product productToCreate) {
        this.products.add(productToCreate);
        
        return productToCreate;
    }
    
    public ArrayList<Product> getAll() {
        return this.products;
    }
    
    public ArrayList<Product> getByProductId(int productId) {
        ArrayList<Product> output = new ArrayList<Product>();
        
        for (Product product : this.products) {
            if (product.getProductId() == productId) {
                output.add(product);
            }
        }
        return output;
    }
}
