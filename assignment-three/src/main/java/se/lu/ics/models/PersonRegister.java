package se.lu.ics.models;

import java.util.ArrayList;
import java.util.List;

public class PersonRegister {
    private List<Person> persons;

    public PersonRegister() {
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public Person findPerson(String identificationNumber) {
        for (Person person : persons) {
            if (person.getIdentificationNumber().equals(identificationNumber)) {
                return person;
            }
        }
        return null;
    }

    public Account findAccount(String identificationNumber, String accountNumber) {
        Person person = findPerson(identificationNumber);
        if (person != null) {
            return person.findAccount(accountNumber);
        }
        return null;
    }

    public double CalculateTotalBalance() {
        double totalBalance = 0;
        for (Person person : persons) {
            totalBalance += person.calculateTotalBalance();
        }
        return totalBalance;
    }
}
