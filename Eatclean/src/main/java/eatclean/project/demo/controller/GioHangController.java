package eatclean.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eatclean.project.demo.enity.Products;
import eatclean.project.demo.service.ProductsFormService;

public class GioHangController {
    @Autowired
    private ProductsFormService productsFormService;

    public GioHangController(ProductsFormService productsFormService) {
        // super();
        this.productsFormService = productsFormService;
    }

    @GetMapping("/products")
    public String search_products(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        List<Products> products = productsFormService.search_products(keyword);
        model.addAttribute("product", products);
        model.addAttribute("keyword", keyword != null ? keyword : "");
        return "gio_hang";
    }

    // @GetMapping("/gio_hang")
    // public String listProducts(Model model) {
    // model.addAttribute("product", productsFormService.listAll());
    // return "gio_hang";
    // }

    @PostMapping("/products")
    public String saveProducts(@ModelAttribute("product") Products product) {
        productsFormService.saveProducts(product);
        return "redirect:/gio_hang";
    }

    // update
    @PostMapping("/products/{id}")
    public String updateProducts(@PathVariable int id, @ModelAttribute("product") Products product, Model model) {
        // get products from database by id
        Products existingProducts = productsFormService.getProductsById(id);
        existingProducts.setId(id);
        existingProducts.setImage(product.getImage());
        existingProducts.setName(product.getName());
        existingProducts.setQuantity(product.getQuantity());
        existingProducts.setPrice(product.getPrice());

        // save updated products object
        productsFormService.updateProducts(existingProducts);
        return "redirect:/gio_hang";
    }

    // delete
    @GetMapping("/products/{id}")
    public String deleteProducts(@PathVariable int id) {
        productsFormService.delete(id);
        return "redirect:/gio_hang";
    }
}