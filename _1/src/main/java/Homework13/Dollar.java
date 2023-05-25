package Homework13;

import java.util.HashMap;

public class Dollar {

    int accountClientId;
    int accountDollarId;
    private long amountOfDollar;

    public Dollar(int accountId, int accountDollarId, long amountOfDollar) {
        this.accountClientId = accountId;
        this.accountDollarId = accountDollarId;
        this.amountOfDollar = amountOfDollar;
    }

    static HashMap<Integer, Dollar> accountDollarList() {
        HashMap<Integer, Dollar> accountDollarList = new HashMap<>();
        accountDollarList.put(1, new Dollar(1, 1223, 382993483));
        accountDollarList.put(122, new Dollar(23232, 1223232, 239899));

        return accountDollarList;
    }

}