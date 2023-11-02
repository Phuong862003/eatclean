package eatclean.project.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.User;

@Repository
<<<<<<< HEAD
public interface UserRepository  extends JpaRepository<User,Integer>{
=======
public interface UserRepository extends JpaRepository<User, Integer> {
>>>>>>> 3fffb76f9a21d95496e6ff2bfac7120e14d289ce
    User findByEmail(String email);

    List<User> findByNameContaining(String name);

    Optional<User> findById(int id);
<<<<<<< HEAD
    User findByLoginId(int loginId);
=======

    List<User> findByLoginId(int loginId);
>>>>>>> 3fffb76f9a21d95496e6ff2bfac7120e14d289ce
}