package eatclean.project.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import eatclean.project.demo.enity.Products;
import eatclean.project.demo.repository.ProductsRepository;
import eatclean.project.demo.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {
    private ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        super();
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Products saveProducts(Products product) {
        return productsRepository.save(product);
    }

    @Override
    public Products getProductsById(int id) {
        return productsRepository.findById(id).get();

    }

    @Override
    public Products updateProducts(Products product) {
        return productsRepository.save(product);
    }

    @Override
    public void deleteProductsById(int id) {
        productsRepository.deleteById(id);
    }
}
