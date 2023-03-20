package com.akshat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        //Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = 12;
        int userNumber = 0;

        do {
            System.out.println("Guess my age from (1-100)");
            userNumber = sc.nextInt();
            if(userNumber == myNumber) {
                System.out.println("My age is correct");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("I am not elder");
            }
            else {
                System.out.println("I am not younger");
            }
        } while(userNumber >= 0);

        System.out.println("My age was : ");
        System.out.println(myNumber);
    }
}
