package Homework13;

import java.util.ArrayList;

public class AccountsList {

    static ArrayList<Integer> getClientAccountsFromName(String clientName) {

        ArrayList<Integer> clientAccountsList = new ArrayList<>();

        for (Client value : Main.clientsList.values()) {
            if (value.getName().equalsIgnoreCase(clientName)) {
                for (Integer key : Main.rublesVariableHashMap.keySet()) {
                    if (value.getAge() == key) {
                        System.out.println("возраст клиента: " + key + " Номер счета: " + Main.rublesVariableHashMap.get(key).accountRublesId);
                        clientAccountsList.add((int) Main.rublesVariableHashMap.get(key).accountRublesId);
                    }
                }
            }
            if (clientAccountsList.size() < 0) {
                System.out.println("There's no accounts for this client");
            }

        }
        return clientAccountsList;
    }

    static ArrayList<Client> getNameFromAccounts(int accountNumber) {

        ArrayList<Client> clientNameList = new ArrayList<>();

        for (Bank value : Main.rublesVariableHashMap.values()) {
            if (value.accountRublesId == accountNumber) {
                for (Integer key : Main.clientsList.keySet()) {
                    if (value.accountClientId == key) {
                        System.out.println("Имя клиента: " + Main.clientsList.get(key).getName());
                        clientNameList.add(Main.clientsList.get(key));
                    }
                }
            }
        }
        for (Dollar value : Dollar.accountDollarList().values()) {
            if (value.accountDollarId == accountNumber) {
                for (Integer key : Main.clientsList.keySet()) {
                    if (value.accountClientId == key) {
                        System.out.println("Имя клиента: " + Main.clientsList.get(key).getName());
                        clientNameList.add(Main.clientsList.get(key));
                    }
                }
            }
        }

        if (clientNameList.size() < 1) {
            System.out.println("There's no clients for this Account Number");
        }

        return clientNameList;
    }
}
