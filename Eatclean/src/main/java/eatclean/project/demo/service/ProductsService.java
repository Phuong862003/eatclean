package eatclean.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eatclean.project.demo.repository.ProductsRepository;
import eatclean.project.demo.enity.Products;

@Service
@Transactional
public class ProductsService {
    @Autowired
    private ProductsRepository repo;

    public List<Products> listAll() {
        return repo.findAll();
    }

    public void save(Products products) {
        repo.save(products);
    }

    public Products get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
