package eatclean.project.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Products;

@Repository
public interface ProductsReposittory extends JpaRepository<Products, Long> {
    // List<Products> findByLoaiSanPhamId(int cateID);

    Optional<Products> findById(int id);
}
