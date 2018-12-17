package com.matmazur.springmvcboot.controllers;

import com.matmazur.springmvcboot.components.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartController {

    private final ShoppingCart shoppingCart;

    @Autowired
    public CartController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @GetMapping("/cart")
    public String cart(ModelMap modelMap) {

        modelMap.put("cart", shoppingCart.getCart());

        return "cart";
    }

    @PostMapping
    public String cart(@RequestParam() String product, ModelMap modelMap) {

        if (!product.isEmpty()) {
            shoppingCart.getCart().add(product);
            modelMap.put("cart", shoppingCart.getCart());
        }
        return "cart";
    }
}
