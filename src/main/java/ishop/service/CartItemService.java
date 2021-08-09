package ishop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ishop.dao.CartItemDao;
import ishop.model.Cart;
import ishop.model.CartItem;

@Service
public class CartItemService {

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);

    }

    public void removeCartItem(int cartItemId) {
        cartItemDao.removeCartItem(cartItemId);
    }

    public void removeAllCartItems(Cart cart) {
        cartItemDao.removeAllCartItems(cart);
    }
}

