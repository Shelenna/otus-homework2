package Homework13._v2;

import java.util.Objects;

public class Client {

    private String firstName;
    private int clientAge;
    private final int accountID;

    public int getClientAge() {
        return clientAge;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    Client(String firstName, int clientAge, int accountID) {
        this.firstName = firstName;
        this.clientAge = clientAge;
        this.accountID = accountID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return accountID == client.accountID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID);
    }
}