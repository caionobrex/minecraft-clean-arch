package org.example.domain.usecases;

import org.example.domain.entities.Product;
import org.example.domain.interfaces.IProductRepository;

public class CreateProduct {
    private IProductRepository productRepository;

    public CreateProduct(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product execute(String name, float price) {
        return this.productRepository.createOne(name, price);
    }
}
