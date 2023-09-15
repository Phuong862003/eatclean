package eatclean.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import eatclean.project.demo.enity.User;
import eatclean.project.demo.enity.UserDto;
import eatclean.project.demo.service.UserService;

@Controller
public class RegisterController {
    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping(path = "/signup")
    public String register(@ModelAttribute UserDto userDto) {
        System.out.println("name: " + userDto.getName());
        System.out.println("email: " + userDto.getEmail());
        System.out.println("username: " + userDto.getUsername());
        System.out.println("password: " + userDto.getPassword());
        System.out.println("role: " + userDto.getRole());
        try {
            userService.register(userDto);
            return "redirect:/login";
        } catch (Exception e) {
            return "redirect:/home";
        }
    }
}
