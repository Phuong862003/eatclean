package eatclean.project.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    Optional<Products> findById(int id);

    void deleteById(int id);

}
