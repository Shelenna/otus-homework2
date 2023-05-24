package Homework13;

import java.util.HashMap;

public class Main {
    public static HashMap<Integer, Client> clientsList;
    public static HashMap<Integer, Bank> rublesVariableHashMap;
    public static HashMap<Integer, Dollar> dollarVariableHashMap;

    public static void main(String[] args) {

        clientsList = new HashMap<>();
        clientsList.put(1, new Client("Ivan(Double)",  10));
        clientsList.put(2, new Client("Sergey",  24));
        clientsList.put(4, new Client("Petr",  97));

        dollarVariableHashMap = Dollar.accountDollarList();


        rublesVariableHashMap = new HashMap<>();
        rublesVariableHashMap.put(3, new Bank(3, 23743, 43223));

        Bank.setBankToAccountList(1,2329,76);
        Bank.setBankToAccountList(2,2332,225322233);

        System.out.println(AccountsList.getClientAccountsFromName("FromMain"));
        System.out.println(AccountsList.getNameFromAccounts(2329));

    }
}
