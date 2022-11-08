package net.yorksolutions.bookbe02.Account;


import javax.persistence.Embeddable;

@Embeddable
public class cartAccount {

    Long id;

    private String userName;

    private String password;

    private Integer qty;

    public cartAccount(Account account, Integer qty) {
        this.userName = account.getUserName();
        this.password = account.getPassword();
        this.qty = qty;
    }

    public cartAccount() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
