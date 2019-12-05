package tudelft.discount;

import java.util.ArrayList;
import java.util.List;
public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }

    public List<Product> setNewPrices() {
        List<Product>  allProducts = dao.all();
        for(Product product : allProducts) {
            if(product.getCategory().equals("BUSINESS")) {
                product.setPrice(product.getPrice() * 1.1);
            }
            if(product.getCategory().equals("HOME")) {
                product.setPrice(product.getPrice() * 0.9);
            }
        }
        return allProducts;

    }
}
