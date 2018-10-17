package tech.bts.onlineshop.business;

import tech.bts.onlineshop.model.CartItem;
import tech.bts.onlineshop.model.ShoppingCart;

public class PurchaseService {

    /**
     * Returns the total price of the cart
     *
     */
    public double calculateTotalAmount(ShoppingCart cart) {

        double total = 0;

        for (CartItem item : cart.getItems()) {
            total += (item.getProduct().getPrice() * item.getQuantity());
        }

        return total;
    }
}
