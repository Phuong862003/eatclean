package eatclean.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eatclean.project.demo.enity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
