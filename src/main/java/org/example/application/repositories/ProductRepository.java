package org.example.application.repositories;

import org.example.domain.entities.Product;
import org.example.domain.interfaces.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return this.products;
    }

    @Override
    public Product findOne(int id) {
        return this.products.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    @Override
    public Product createOne(String name, float price) {
        return new Product(1, name, price);
    }
}
