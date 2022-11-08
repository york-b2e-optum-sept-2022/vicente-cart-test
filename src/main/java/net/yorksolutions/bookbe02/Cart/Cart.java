package net.yorksolutions.bookbe02.Cart;


import net.yorksolutions.bookbe02.Account.Account;
import net.yorksolutions.bookbe02.Account.cartAccount;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @ElementCollection
    private Set<cartAccount> accountsList;

    Long userId;

    public Cart(Long userId) {
        this.userId = userId;
    }

    public Cart() {
    }

    public Set<cartAccount> getAccountsList() {
        return accountsList;
    }

    public Long getId() {
        return id;
    }

    public void setAccountsList(Account account) {

        cartAccount accountToAdd = new cartAccount(account, 5);

        this.accountsList.add(accountToAdd);

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
