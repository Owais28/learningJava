package com.learning.fundamentalstructure;

import java.io.Console;

public class InputAndOutput {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println(console);

        String name = console.readLine("Username: ");
        char[] password = console.readPassword("Password: ");
    }
}
