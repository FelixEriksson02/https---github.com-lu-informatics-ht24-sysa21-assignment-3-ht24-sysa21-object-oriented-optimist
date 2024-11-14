package se.lu.ics.models;

import java.util.ArrayList;

public class Person {
    // attrubut för person
    private String identificationNumber;
    private String name;
    private int age;

    private ArrayList<Account> accounts = new ArrayList<Account>(); // skapar en arraylist för att lagra konton

    // konstruktor för person
    public Person() {

    }

    // konstruktor för person
    public Person(String identificationNumber, String name, int age) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.age = age;
    }

    // adderar konton till konto array listan om antalet konton är mindre än 3 och
    // personen är över 18 år gammal
    // om personen inte över 18 år gammal och antalet konton över 3 skickas ett
    // felmeddelande
    public void addAccount(Account account) {
        if (this.accounts.size() > 3) {
            System.out.println("You can't have more than two accounts SILLY GOOSE");
        } else if (this.age < 18) {
            System.out.println("You have to be 18 years old to open an account you young child!!!!!!!!");
        } else {
            this.accounts.add(account);
        }
    }

    // metod för att beräkna kontosaldo kolla över metoden om Account account :
    // Accounts skall bytas till person
    public double calculateTotalBalance() {
        double totalBalance = 0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    // metod för att hitta konto
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) { // kollar igenom alla konton i arraylistan
            if (account.getAccountNumber().equals(accountNumber)) {// om kontonumret matchar det som söks returneras
                                                                   // kontot
                return account;
            }
        }
        return null;
    }

    // Getter och setters för alla instansvariabler
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
