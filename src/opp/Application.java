package opp;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user  = new User();
        user.createUser(scanner);
        user.introduceYourself();
        System.out.println(user.firstName+" " + user.lastName +" " + user.phoneNumber+" "+user.email);
    }


}
