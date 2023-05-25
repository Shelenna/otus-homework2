package Homework13._v2;

import java.util.*;
import java.util.stream.Collectors;

import static Homework13._v2.MainHash.*;
public class AccountsList {

    static HashMap<Client, HashSet<Account>> createAndAddAccountToHashSet(Client key, int rublesAccountId, int dollarAccountId, long rublesAccountAmount, long dollarAccountAmount) {

        if (accountsAndClientsListMapSet.containsKey(key)) {
            accountsAndClientsListMapSet.get(key).add(new Account(key.getAccountID(), rublesAccountId, dollarAccountId, rublesAccountAmount, dollarAccountAmount));
        } else {
            HashSet<Account> set = new HashSet<>();
            set.add(new Account(key.getAccountID(), rublesAccountId, dollarAccountId, rublesAccountAmount, dollarAccountAmount));
            accountsAndClientsListMapSet.put(key, set);
        }
        return accountsAndClientsListMapSet;
    }

    static HashSet<Integer> getAccountIdFromClientName(String clientName){
        HashSet<Account> tempArray = new HashSet<>();
        HashSet<Integer> tempIntegerArray = new HashSet<>();

        for (Client client : accountsAndClientsListMapSet.keySet()) {
            if (client.getFirstName().equalsIgnoreCase(clientName)) {
                accountsAndClientsListMapSet.get(client).stream().collect(Collectors.toCollection(() -> tempArray));
                for (Account account : tempArray) {
                    tempIntegerArray.add(account.getDollarAccountId());
                    tempIntegerArray.add(account.getRublesAccountId());
                }
                return tempIntegerArray;
            }
        }
        return null;
    }

    static HashSet<Integer> getAccountIdFromClientAccountName(Client accountKey){
        HashSet<Account> tempArray = new HashSet<>();
        HashSet<Integer> tempIntegerArray = new HashSet<>();
        if (accountsAndClientsListMapSet.containsKey(accountKey)) {
            accountsAndClientsListMapSet.get(accountKey).stream().collect(Collectors.toCollection(() -> tempArray));
            for (Account account : tempArray) {
                tempIntegerArray.add(account.getDollarAccountId());
                tempIntegerArray.add(account.getRublesAccountId());
            }
            return tempIntegerArray;
        }
        return null;
    }
    static String getNameFromAccountId(int accountId){

        for (Client client : accountsAndClientsListMapSet.keySet()) {
            if (client.getAccountID() == accountId) {
                return client.getFirstName();
            }
        }

        return "клиент не найден";
    }
}
