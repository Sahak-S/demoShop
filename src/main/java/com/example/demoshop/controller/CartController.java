package com.example.demoshop.controller;

import com.example.demoshop.global.GlobalData;
import com.example.demoshop.model.Product;
import com.example.demoshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {

    @Autowired
    ProductService productService;


    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable int id) {
        GlobalData.cart.add(productService.getProductById(id).get());
        return "redirect:/shop";
    }

    @GetMapping("/cart")
    public String cartGet(ModelMap map) {
        map.addAttribute("cartCount", GlobalData.cart.size());
        map.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
        map.addAttribute("cart", GlobalData.cart);
        return "cart";
    }

    @GetMapping("/cart/removeItem/{index}")
    public String cartItemRemuve(@PathVariable int index) {
        GlobalData.cart.remove(index);
        return "redirect/cart";
    }

    @GetMapping("checkout")
    public String checkout(ModelMap map) {
        map.addAttribute("total", GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
        return "checkout";
    }
}