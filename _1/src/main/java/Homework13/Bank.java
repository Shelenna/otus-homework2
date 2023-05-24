package Homework13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    int accountClientId, accountRublesId;
    long amountOfRubles;

    public Bank(int accountClientId, int accountRublesId, long amountOfRubles) {
        this.accountClientId = accountClientId;
        this.accountRublesId = accountRublesId;
        this.amountOfRubles = amountOfRubles;
    }

    public static Bank setBankToAccountList(int accountClientId, int accountRublesId, long amountOfRubles) {
        return Main.rublesVariableHashMap.put(accountRublesId, new Bank(accountClientId, accountRublesId, amountOfRubles));
    }
}