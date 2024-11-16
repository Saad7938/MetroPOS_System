package org.example.service.product;

import org.example.model.product.Product;
import org.example.repository.product.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
