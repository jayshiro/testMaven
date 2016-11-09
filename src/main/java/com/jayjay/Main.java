package com.jayjay;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        scanner();
    }
    private static void scanner() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(!command.equals("quit")) {
            command = scanner.nextLine();
            System.out.println("command: " + command);
        }
        System.out.println("Program terminated.");
    }

    private static void console() {
        Console c = System.console();
        if(c == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        String command = "";

        while(!command.equals("quit")) {
            command = c.readLine("What is your command: ");
            System.out.println("Command: " + command);
        }
        System.out.println("Program terminated.");

    }
}
