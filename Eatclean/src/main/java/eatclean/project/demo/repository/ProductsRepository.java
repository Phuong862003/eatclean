package eatclean.project.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import eatclean.project.demo.enity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findByNameContaining(String name);
    Optional<Products> findById(int id);
    // Products findById(int id);
    void deleteById(int id);
}


