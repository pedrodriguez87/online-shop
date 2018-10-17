package tech.bts.onlineshop.model;

import java.util.List;

public class ShoppingCart {

    private List<CartItem> items;

    public List<CartItem> getItems() {
        return items;
    }

    public ShoppingCart(List<CartItem> items) {
        this.items = items;
    }
}
