package org.example.domain.interfaces;

import org.example.domain.entities.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findOne(int id);
    Product createOne(String name, float price);
}
