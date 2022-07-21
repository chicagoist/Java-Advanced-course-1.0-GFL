package com.task.taskFirst;

import java.util.Scanner;
//import java.io. * ;

public class HelloWorld {
    public static void main (String[] args) {

        MyFirstClass myFirstClass = new MyFirstClass("First", 11);
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);


        System.out.println("My id is = " + myFirstClass.getId());
        System.out.println("My status is = " + myFirstClass.getStatus());
        System.out.println();


        System.out.print("Enter your new id : ");
        int newId = sc.nextInt();
        myFirstClass.setId(newId);
        System.out.println();

        System.out.print("Enter your new status : ");
        String newStatus = scStr.nextLine();
        myFirstClass.setStatus(newStatus);
        System.out.println();



        System.out.println("My new id is = " + myFirstClass.getId());
        System.out.println("My new status is = " + myFirstClass.getStatus());
        System.out.println();

        System.out.println("Привет, Юзверь!");

    }
}
