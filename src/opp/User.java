package opp;

import java.util.Scanner;

public class User {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;

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

}

