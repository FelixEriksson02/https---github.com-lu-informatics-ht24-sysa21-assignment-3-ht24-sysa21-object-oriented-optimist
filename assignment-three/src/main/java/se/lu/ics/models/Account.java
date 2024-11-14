package se.lu.ics.models;

public class Account {

    private String accountNumber; // kontonummer
    private double balance; // saldo
    private Person person; // skapar associaton med personen som äger kontot

    // tom konstruktor för Account
    public Account() {
    }

    // Konstruktor för konto
    public Account(String accountNumber, double balance, Person person) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.person = person;
    }

    // Konstruktor för uttag av pengar från konto ändra ordning på if satserna för
    // att visa att det inte finns tillräckligt med pengar på kontot
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Not enough money in the account"); // skickar error meddelande för att visa att det inte
                                                                   // finns tillräckligt med pengar på kontot
        } else if (balance - amount < (balance * 0.5)) {
            System.out.println("Warning: You're trying to withdraw 50% of your total balance, it is not possible"); // skickar
                                                                                                                    // varning
                                                                                                                    // om
                                                                                                                    // saldot
                                                                                                                    // är
                                                                                                                    // under
                                                                                                                    // 50%
                                                                                                                    // av
                                                                                                                    // totala
                                                                                                                    // saldot
        } else if (amount < 0) {
            System.out.println("You can't withdraw a negative amount"); // skickar error meddel
        } else { // slut på if loop om det skulle finnas tillräckligt med saldo och visar då
                 // eftersom allt funkar
            balance -= amount;
        }
    }

    // metod för insättningar på konto
    public void deposit(double amount) {
        if (amount < 0) { // om insättningen är mindre än 0 skall errormeddelande printas
            System.out.println("Cannot deposit negative amount");
        } else {
            balance += amount;
        }
    }

    @Override
    public String toString() { // FRÅGA PÅ LABBEN VAD KODEN GÖR
        return "Account" + (Integer.parseInt(accountNumber) + 1);
    }

    // getter och setters för alla instansvariabler
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // association med person leder till getter and setter för Person
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
// kolla hur man ska stänga korrekt
