package Homework13._v2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Account {

    private final int rublesAccountId, dollarAccountId, accountClientId;
    private long rublesAccountAmount, dollarAccountAmount;

    public void setRublesAccountAmount(long rublesAccountAmount) {
        this.rublesAccountAmount = rublesAccountAmount;
    }

    public void setDollarAccountAmount(long dollarAccountAmount) {
        this.dollarAccountAmount = dollarAccountAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return rublesAccountId == account.rublesAccountId && dollarAccountId == account.dollarAccountId && accountClientId == account.accountClientId && rublesAccountAmount == account.rublesAccountAmount && dollarAccountAmount == account.dollarAccountAmount;
    }

    public int getRublesAccountId() {
        return rublesAccountId;
    }

    public int getDollarAccountId() {
        return dollarAccountId;
    }

    public int getAccountClientId() {
        return accountClientId;
    }

    public long getRublesAccountAmount() {
        return rublesAccountAmount;
    }

    public long getDollarAccountAmount() {
        return dollarAccountAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountClientId);
    }

    public Account(int accountClientID, int rublesAccountId, int dollarAccountId, long rublesAccountAmount, long dollarAccountAmount) {
        this.accountClientId = accountClientID;
        this.rublesAccountId = rublesAccountId;
        this.dollarAccountId = dollarAccountId;
        this.rublesAccountAmount = rublesAccountAmount;
        this.dollarAccountAmount = dollarAccountAmount;
    }
}
