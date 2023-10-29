package eatclean.project.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThongkeController {
    @GetMapping("/thongke")
    public String thongke(){
        return "thongke";
    }
}
