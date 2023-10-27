package eatclean.project.demo.controller;

import java.util.List;
import eatclean.project.demo.enity.Products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import eatclean.project.demo.service.ProductsService;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {
    @Autowired
    ProductsService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Products> listProducts = service.listAll();
        model.addAttribute("listProducts", listProducts);
        return "form_chuc_nang";
    }

    @RequestMapping("/new")
    public String showNewProductsPage(Model model) {
        Products products = new Products();
        model.addAttribute("products", products);
        return "form_them";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProducts(@ModelAttribute("products") Products products) {
        service.save(products);
        return "redirect:/";
    }

    // sửa
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductsPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("form_edit");
        Products products = service.get(id);
        mav.addObject("products", products);
        return mav;
    }

    // xóa
    @RequestMapping("/delete/{id}")
    public String deleteProducts(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
