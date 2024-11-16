package org.example.repository.product;

import org.example.model.product.Product;
import java.util.List;

public class ProductRepository {
    public Product save(Product product) {
        return product;
    }

    public Product findById(Long id) {
        return null;
    }

    public List<Product> findAll() {
        return null;
    }
}
