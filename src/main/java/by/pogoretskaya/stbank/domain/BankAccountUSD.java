package by.pogoretskaya.stbank.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankAccountUSD {

    @Id
    public Long id;

    private String userAccountUSD;
    private int userMoneyUSD;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserAccountUSD() {
        return userAccountUSD;
    }

    public void setUserAccountUSD(String userAccountUSD) {
        this.userAccountUSD = userAccountUSD;
    }

    public int getUserMoneyUSD() {
        return userMoneyUSD;
    }

    public void setUserMoneyUSD(int userMoneyUSD) {
        this.userMoneyUSD = userMoneyUSD;
    }
}
