package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
       String name, age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        name = input.nextLine();
        System.out.println("Enter your age");
        age = input.nextLine();
        System.out.println("your name is"+ name);
        System.out.println("your age is"+ age);
    }
}
