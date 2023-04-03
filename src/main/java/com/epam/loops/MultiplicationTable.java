package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + (numberTableToPrint * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            MultiplicationTable table = new MultiplicationTable();
            table.printTable(number);
        } else {
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }

}
