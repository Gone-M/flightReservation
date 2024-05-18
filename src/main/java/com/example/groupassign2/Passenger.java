

// Civan Metin - 101441732
// Maggie Hall - 101447078
// Tomer Edelman - 101400506


package com.example.groupassign2;

public class Passenger {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Passenger(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
