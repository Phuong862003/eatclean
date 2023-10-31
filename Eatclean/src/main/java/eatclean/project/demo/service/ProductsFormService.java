package eatclean.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eatclean.project.demo.enity.Products;
import eatclean.project.demo.repository.ProductsFormRepository;
import eatclean.project.demo.repository.ProductsReposittory;

@Service
public class ProductsFormService {
    @Autowired
    private ProductsReposittory productsReposittory;

    public List<Products> listAll() {
        return productsReposittory.findAll();
    }

    public Products saveProducts(Products products) {
        return productsReposittory.save(products);
    }

    public Products getProductsById(int id) {
        return productsReposittory.findById(id).get();
    }

    public void delete(int id) {
        productsReposittory.deleteById((long) id);
    }

    // public List<Products> listByCategory(int cateID) {
    // return productsFormRepository.findByLoaiSanPhamId(cateID);
    // }

    // public Object listCategory() {
    // return null;
    // }

    public Products updateProducts(Products products) {
        return productsReposittory.save(products);
    }

    // public List<Products> search_products(String keyword) {
    // return null;
    // }
}
