package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class Person {
    private final String firstName;// this is the set up and it final what cant be changed
    private final String lastName;

    public Person(String firstName, String lastName) {// this is the constructor
        this.firstName = firstName;// this is setting up the frist name to assign it to String firstName
        this.lastName = lastName;// dido above
    }

    // why is this called a GETTER??
    public String getFirstName() {
        return firstName;
    } // this getter is getting the var(firstName) as the return.


    public String getLastName() {
        return lastName;
    }// this getter is getting the var(lastName) as the return

    @Override // why is Override here??
    public String toString() {// you override the method to get the desired print out/ return your looking for
        return new StringBuilder() // every thing below appends to the string builder.
                .append("\nMy first name is " + firstName) // this takes and any firstName and concat it the String
                .append("\nMy last name is " + lastName)// this appends to the first name
                .toString();
    }
}
