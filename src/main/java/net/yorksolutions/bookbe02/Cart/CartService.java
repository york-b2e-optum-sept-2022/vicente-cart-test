package net.yorksolutions.bookbe02.Cart;


import net.yorksolutions.bookbe02.Account.Account;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service
public class CartService {

    CartRepo cartRepo;

    public CartService(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }


    public void createCart(Cart cart) {
        this.cartRepo.save(cart);
    }


    public void addToCart(Account account, Long cartID) {

        Optional<Cart> findCart = this.cartRepo.findById(cartID);

        Cart updatedCart = findCart.get();
        updatedCart.setAccountsList(account);
        this.cartRepo.save(updatedCart);
    }
}
