package eatclean.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import eatclean.project.demo.enity.Login;
import eatclean.project.demo.enity.Products;
import eatclean.project.demo.enity.User;
import eatclean.project.demo.service.LoginService;
import eatclean.project.demo.service.ProductsService;
import eatclean.project.demo.service.SearchProService;
import eatclean.project.demo.service.UserService;

@Controller
public class DathangController {

    @Autowired 
    private LoginService loginService;

    @Autowired
    private UserService userService;

    @Autowired 
    private SearchProService searchProService;

    @GetMapping("/dathang/{loginID}/{productID}")
    public String dathang(@PathVariable int loginID, @PathVariable int productID, Model model){
        Login login = loginService.getById(loginID);
        User user = userService.getUserByLoginId(loginID);
        Products products = searchProService.getById(productID);

        model.addAttribute("login", login);
        model.addAttribute("user", user);
        model.addAttribute("products", products);

        return "dathang";
    }


}
