package com.VGprojects.BuySellProject.services;

import com.VGprojects.BuySellProject.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private List<Product> products;
    private Long ID = 0L;

    {
        products.add(new Product(++ID,"Playstation 5", "Simple description", 67000, "Moscow", "Tomas"));
        products.add(new Product(++ID,"Iphone X", "Simple description", 77000, "Rostov", "John"));
        products.add(new Product(++ID,"Nintendo Switch", "Simple description", 67000, "Krasnodar", "Randy"));
    }
    public List<Product> listProducts() {return products;}

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

}
