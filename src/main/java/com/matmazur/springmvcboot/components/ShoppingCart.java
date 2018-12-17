package com.matmazur.springmvcboot.components;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashSet;
import java.util.Set;

// to use it as a singleton simply comment @Scope line
@Component
@Scope(scopeName = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart {

    private Set<String> cart;

    public ShoppingCart() {
        this.cart = new HashSet<>();
    }

    public Set<String> getCart() {
        return cart;
    }

    public void setCart(Set<String> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cart=" + cart +
                '}';
    }
}
