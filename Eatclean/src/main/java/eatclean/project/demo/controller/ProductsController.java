package eatclean.project.demo.controller;

import java.util.List;
import eatclean.project.demo.enity.Products;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eatclean.project.demo.service.ProductsFormService;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {
    @Autowired
    private ProductsFormService productsFormService;

    public ProductsController(ProductsFormService productsFormService) {
        // super();
        this.productsFormService = productsFormService;
    }

    // @GetMapping("/products")
    // public String search_products(@RequestParam(name = "keyword", required =
    // false) String keyword, Model model) {
    // List<Products> products = productsFormService.search_products(keyword);
    // model.addAttribute("products", products);
    // model.addAttribute("keyword", keyword != null ? keyword : "");
    // return "products";
    // }



    @GetMapping("/products/new")
    public String createProductsForm(Model model) {
        Products product = new Products();
        model.addAttribute("products", product);
        return "create_products";
    }

    @PostMapping("/products")
    public String saveProducts(@ModelAttribute("products") Products product) {
        productsFormService.saveProducts(product);
        return "redirect:/products";
    }

    // sửa
    @GetMapping("/products/edit/{id}")
    public String editProductsForm(@PathVariable int id, Model model) {
        model.addAttribute("products", productsFormService.getProductsById(id));
        return "edit_products";
    }

    // update
    @PostMapping("/products/{id}")
    public String updateProducts(@PathVariable int id, @ModelAttribute("products") Products product, Model model) {
        // get products from database by id
        Products existingProducts = productsFormService.getProductsById(id);
        existingProducts.setId(id);
        existingProducts.setImage(product.getImage());
        existingProducts.setName(product.getName());
        existingProducts.setQuantity(product.getQuantity());
        existingProducts.setPrice(product.getPrice());

        // save updated products object
        productsFormService.updateProducts(existingProducts);
        return "redirect:/products";
    }

    // delete
    @GetMapping("/products/{id}")
    public String deleteProducts(@PathVariable int id) {
        productsFormService.delete(id);
        return "redirect:/products";
    }
}
