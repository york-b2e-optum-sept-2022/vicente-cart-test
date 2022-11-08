package net.yorksolutions.bookbe02.Account;


import org.springframework.stereotype.Service;

@Service
public class AccountService {

    AccountRepo accountRepo;

    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public Iterable<Account> getAccounts() {
        return this.accountRepo.findAll();
    }

    public void addAccount(Account account) {
        this.accountRepo.save(account);
    }


}
