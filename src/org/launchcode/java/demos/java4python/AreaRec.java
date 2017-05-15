package org.launchcode.java.demos.java4python;
import java.util.Scanner;
/**
 * Created by crows on 5/15/2017.
 */
public class AreaRec {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Length: ");
        int length = Integer.parseInt(in.nextLine());

        System.out.print("Width: ");
        int width = Integer.parseInt(in.nextLine());


        System.out.println("The are of the rectangle is: " + AreaRec(length, width));
    }

    private static int AreaRec(int length, int width){
        return length * width;
    }

}
