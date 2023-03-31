package com.example.demoshop.controller;

import com.example.demoshop.global.GlobalData;
import com.example.demoshop.service.CategoryService;
import com.example.demoshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;

    @GetMapping({"/","/home"})
    public String home(ModelMap map){
        map.addAttribute("cartCount", GlobalData.cart.size());

        return "index";
    }

    @GetMapping("/shop")
    public String shop(ModelMap map){
        map.addAttribute("categories",categoryService.getAllCategory());
        map.addAttribute("products",productService.getAllProduct());
        map.addAttribute("cartCount",GlobalData.cart.size());

        return "shop";
    }
    @GetMapping("/shop/category/{id}")
    public String shopByCategory(ModelMap map, @PathVariable int id){
        map.addAttribute("categories",categoryService.getAllCategory());
        map.addAttribute("cartCount",GlobalData.cart.size());

        map.addAttribute("products",productService.getAllProductsByCategoryId(id));
        return "shop";
    }
    @GetMapping("/shop/viewproduct/{id}")
    public String viewProduct(ModelMap map, @PathVariable int id){
        map.addAttribute("product",productService.getProductById(id).get());
        map.addAttribute("cartCount",GlobalData.cart.size());

        return "viewProduct";
    }
}
