package org.example.controller.product;

import org.example.model.product.Product;
import org.example.service.product.ProductService;

public class ProductController {
    private final ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    public Product createProduct(Product product) {
        return productService.createProduct(product);
    }
}
