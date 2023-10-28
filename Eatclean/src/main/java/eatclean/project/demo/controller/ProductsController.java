package eatclean.project.demo.controller;

// import java.util.List;
import eatclean.project.demo.enity.Products;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

import eatclean.project.demo.service.ProductsService;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        super();
        this.productsService = productsService;
    }

    @GetMapping("/form_chuc_nang")
    public String listProducts(Model model) {
        model.addAttribute("products", productsService.getAllProducts());
        return "form_chuc_nang";
    }

    @GetMapping("/products/new")
    public String showNewProductsPage(Model model) {
        Products product = new Products();
        model.addAttribute("product", product);
        return "create_products";
    }

    @PostMapping("/products")
    public String saveProducts(@ModelAttribute("product") Products product) {
        productsService.saveProducts(product);
        return "redirect:/form_chuc_nang";
    }

    // sửa
    @GetMapping("/products/edit/{id}")
    public String editProductsForm(@PathVariable int id, Model model) {
        model.addAttribute("product", productsService.getProductsById(id));
        return "edit_products";
    }

    // update
    @PostMapping("/products/{id}")
    public String updateProducts(@PathVariable int id, @ModelAttribute("product") Products product, Model model) {
        // get products from database by id
        Products existingProducts = productsService.getProductsById(id);
        existingProducts.setId(id);
        existingProducts.setImage(product.getImage());
        existingProducts.setName(product.getName());
        existingProducts.setQuantity(product.getQuantity());
        existingProducts.setPrice(product.getPrice());

        // save updated products object
        productsService.updateProducts(existingProducts);
        return "redirect:/form_chuc_nang";
    }

    // delete
    @GetMapping("/products/{id}")
    public String deleteProducts(@PathVariable int id) {
        productsService.deleteProductsById(id);
        return "redirect:/form_chuc_nang";
    }
}
