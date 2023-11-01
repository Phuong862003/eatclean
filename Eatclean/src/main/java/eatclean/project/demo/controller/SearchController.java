package eatclean.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eatclean.project.demo.enity.Products;
import eatclean.project.demo.service.SearchProService;

@Controller
public class SearchController {

    @Autowired
    private SearchProService searchProService;

    @GetMapping("/search")
    public String search(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        List<Products> products = searchProService.search(keyword);
        model.addAttribute("products", products);
        model.addAttribute("keyword", keyword != null ? keyword : "");
        return "search";
    }
}
