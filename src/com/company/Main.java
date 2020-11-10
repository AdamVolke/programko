package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "             _                           \n" +
                "            | |                          \n" +
                " _ __   ___ | |_ ___    __ _ _ __  _ __  \n" +
                "| '_ \\ / _ \\| __/ _ \\  / _` | '_ \\| '_ \\ \n" +
                "| | | | (_) | ||  __/ | (_| | |_) | |_) |\n" +
                "|_| |_|\\___/ \\__\\___|  \\__,_| .__/| .__/ \n" +
                "                            | |   | |    \n" +
                "                            |_|   |_|    \n");
        int homeworks = 0;
        int first = 1;
        int second = 1;
        String[] Robin = new String[10];
        while (homeworks <= 10) {
            while (first == 1) {
                System.out.println("-----------------------------------------------------");
                System.out.println("You can add up to 10 tasks!");
                System.out.println("You have " + homeworks + "/10!");
                System.out.println("-----------------------------------------------------");
                System.out.println("1) Manage tasks");
                System.out.println("2) Exit");
                first = Integer.parseInt(sc.nextLine());
                if(first == 1){
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Tasks management");
                    System.out.println("-----------------------------------------------------");
                    while(second != 4){
                        System.out.println("1) Create a new task");
                        System.out.println("2) Update a task");
                        System.out.println("3) Destroy a task");
                        System.out.println("4) Back to main menu");
                        second = Integer.parseInt(sc.nextLine());
                    }
                }
            }
        }
    }
}