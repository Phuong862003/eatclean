package eatclean.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD

import eatclean.project.demo.enity.Login;
import eatclean.project.demo.enity.Products;
import eatclean.project.demo.enity.User;
import eatclean.project.demo.service.LoginService;
import eatclean.project.demo.service.ProductsService;
import eatclean.project.demo.service.SearchProService;
import eatclean.project.demo.service.UserService;
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eatclean.project.demo.enity.Login;
import eatclean.project.demo.enity.Order;
import eatclean.project.demo.enity.Products;
import eatclean.project.demo.enity.User;
import eatclean.project.demo.service.LoginService;
import eatclean.project.demo.service.OrderService;
import eatclean.project.demo.service.SearchProService;
import eatclean.project.demo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1

@Controller
public class DathangController {

    @Autowired 
    private LoginService loginService;

    @Autowired
    private UserService userService;

    @Autowired 
    private SearchProService searchProService;

<<<<<<< HEAD
=======
    @Autowired
    private OrderService orderService;

>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1
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

<<<<<<< HEAD
=======
    @PostMapping("/dathang/{loginID}/{productID}")
    public String Orders(Model model, @PathVariable int loginID, @PathVariable int productID, @RequestParam int quantity){
        Login login = loginService.getById(loginID);
        User user = userService.getUserByLoginId(loginID);
        Products products = searchProService.getById(productID);

        Order order = new Order();
        order.setUser(user);
        order.setProducts(products);
        order.setMoney(products.getPrice() * quantity); 

        orderService.saveOrder(order);

        model.addAttribute("message", "Dat hang thanh cong");

        return "dathang";
    }


>>>>>>> 07abb4679499e83b6dcc95712cf8ba82ce08c2a1

}
