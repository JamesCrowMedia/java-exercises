package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * Created by crows on 5/15/2017.
 */
public class StringContains {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("String to search: ");
        String searchString = in.nextLine();

        System.out.print("Search Term: ");
        String searchTerm = in.nextLine();

        if(stringContains(searchString, searchTerm)){
            System.out.print("Your string contains [" + searchTerm + "].");
        }else {
            System.out.print("Your string does not contain [" + searchTerm + "].");
        }
    }

    public static boolean stringContains(String searchString, String searchTerm){
        return searchString.toLowerCase().contains(searchTerm.toLowerCase());
    }
}
