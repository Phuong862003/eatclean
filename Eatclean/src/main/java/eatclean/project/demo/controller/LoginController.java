package eatclean.project.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import eatclean.project.demo.enity.Login;
import eatclean.project.demo.service.LoginService;

@Controller
public class LoginController {
    @Autowired
    private LoginService userService;

    @GetMapping("/")
    // @PreAuthorize("isAuthenticated()")
    public String home(){
        return "home";
    }

    @GetMapping("/login")        
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());
        return mav;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("user") Login user ) {
    	
    	Login oauthUser = userService.login(user.getUsername(), user.getPassword());
    	System.out.print(oauthUser);

        ModelAndView modelAndView = new ModelAndView();

    	if(Objects.nonNull(oauthUser)) 
    	{	
            if("admin".equals(oauthUser.getRole()) || "ADMIN".equals(oauthUser.getRole())){
                modelAndView.setViewName("redirect:/thongke");
            }
    		else{
                modelAndView.setViewName("redirect:/");
            }
    	} else {
    		// return "redirect:/login?error=true";	
            modelAndView.addObject("error", true);
            modelAndView.addObject("errorMessage", "Tài khoản hoặc mật khẩu không đúng!!!");
            modelAndView.setViewName("login");
    	}
        return modelAndView;
       
    }
    
}
