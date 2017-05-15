package org.launchcode.java.demos.java4python;
import java.util.Scanner;
/**
 * From "Java for Python Programmers"
 */
public class Hello {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}
