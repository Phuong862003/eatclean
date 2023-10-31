package eatclean.project.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import eatclean.project.demo.enity.Products;

<<<<<<< HEAD:Eatclean/src/main/java/eatclean/project/demo/repository/ProductsFormRepository.java
@Repository
public interface ProductsFormRepository extends JpaRepository<Products, Long> {

=======
public interface ProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findByNameContaining(String name);
>>>>>>> b412a1052e8e0f8625b9f8e625d8da564d526e5b:Eatclean/src/main/java/eatclean/project/demo/repository/ProductsRepository.java
    Optional<Products> findById(int id);
    void deleteById(int id);
<<<<<<< HEAD:Eatclean/src/main/java/eatclean/project/demo/repository/ProductsFormRepository.java

    // List<Products> findByLoaiSanPhamId(int cateID);

=======
>>>>>>> b412a1052e8e0f8625b9f8e625d8da564d526e5b:Eatclean/src/main/java/eatclean/project/demo/repository/ProductsRepository.java
}


