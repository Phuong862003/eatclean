package eatclean.project.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Login;
import eatclean.project.demo.enity.User;

@Repository
<<<<<<< HEAD
public interface LoginRepository extends JpaRepository<Login, Integer>{
	Login findByUsernameAndPassword(String username, String password);
=======
public interface LoginRepository extends JpaRepository<Login, Integer> {
    Login findByUsernameAndPassword(String username, String password);

>>>>>>> 3fffb76f9a21d95496e6ff2bfac7120e14d289ce
    Login findByUsername(String username);

    Login findById(int id);
    // List<Login> findByLoginId(int loginId);
}
