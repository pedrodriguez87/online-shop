package tech.bts.onlineshop;

import tech.bts.onlineshop.business.PurchaseService;
import tech.bts.onlineshop.model.CartItem;
import tech.bts.onlineshop.model.Product;
import tech.bts.onlineshop.model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        Product p1 = new Product("Macbook", 1500);
        Product p2 = new Product("Iphone xs",1200);
        Product p3 = new Product("Pixel 3", 900);

        List<CartItem> items = new ArrayList<>();
        items.add(new CartItem(p1, 2) );
        items.add(new CartItem(p2, 3) );
        items.add(new CartItem(p3, 1) );

        ShoppingCart cart = new ShoppingCart(items);

        PurchaseService purchaseService = new PurchaseService();
        purchaseService.calculateTotalAmount(cart);
    }
}
