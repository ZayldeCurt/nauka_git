package opp;

import java.util.Objects;
import java.util.Scanner;

public class User {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public void createUser(Scanner scanner) {
        System.out.println("insert name");
        this.firstName = scanner.nextLine();

        System.out.println("insert lastname");
        this.lastName = scanner.nextLine();

        System.out.println("insert phonenumber");
        this.phoneNumber = scanner.nextLine();

        System.out.println("insert email");
        this.email = scanner.nextLine();
    }
    public void introduceYourself()
    {
        System.out.println(firstName+" " + lastName +" " + phoneNumber+" "+email);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

