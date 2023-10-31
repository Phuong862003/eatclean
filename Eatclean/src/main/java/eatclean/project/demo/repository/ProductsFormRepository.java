package eatclean.project.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Products;

@Repository
public interface ProductsFormRepository extends JpaRepository<Products, Long> {

    Optional<Products> findById(int id);

    void deleteById(int id);

    // List<Products> findByLoaiSanPhamId(int cateID);

}
