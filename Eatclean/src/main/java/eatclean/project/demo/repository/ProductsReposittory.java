package eatclean.project.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Products;

@Repository
public interface ProductsReposittory extends JpaRepository<Products, Integer> {
    List<Products> findByNameContaining(String name);

    Optional<Products> findById(int id);
<<<<<<< HEAD:Eatclean/src/main/java/eatclean/project/demo/repository/ProductsRepository.java
    // Products findById(int id);
=======

>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1:Eatclean/src/main/java/eatclean/project/demo/repository/ProductsReposittory.java
    void deleteById(int id);

    // List<Products> findByLoaiSanPhamId(int cateID);

}
