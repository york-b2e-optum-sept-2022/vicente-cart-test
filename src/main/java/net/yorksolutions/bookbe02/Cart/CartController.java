package net.yorksolutions.bookbe02.Cart;


import net.yorksolutions.bookbe02.Account.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public void createCart(@RequestBody Cart cart) {
        this.cartService.createCart(cart);
    }

    @PutMapping
    public void addToCart(@RequestBody Account account,@RequestParam Long ID) {



        this.cartService.addToCart(account, ID);
    }
}
