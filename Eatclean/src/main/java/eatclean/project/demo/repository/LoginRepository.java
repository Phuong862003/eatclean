package eatclean.project.demo.repository;


import java.lang.Long;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Login;


@Repository
<<<<<<< HEAD
public interface LoginRepository extends JpaRepository<Login, Integer>{
	Login findByUsernameAndPassword(String username, String password);
=======

public interface LoginRepository extends JpaRepository<Login, Integer> {
    Login findByUsernameAndPassword(String username, String password);

>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1
    Login findByUsername(String username);

    Login findById(int id);
    // List<Login> findByLoginId(int loginId);
}
