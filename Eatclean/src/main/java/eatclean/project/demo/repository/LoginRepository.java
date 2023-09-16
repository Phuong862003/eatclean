package eatclean.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eatclean.project.demo.enity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);
    Login findByUsername(String username);
}
