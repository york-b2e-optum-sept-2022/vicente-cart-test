package net.yorksolutions.bookbe02.Account;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public Iterable<Account> getAccounts() {
        return this.accountService.getAccounts();
    }


    @PostMapping
    public void addAccount(@RequestBody Account account) {
        this.accountService.addAccount(account);
    }







}

