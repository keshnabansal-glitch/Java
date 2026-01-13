// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float P = input.nextFloat(); //P = principal
        System.out.println("Enter the time (in years): ");
        float T = input.nextFloat(); // T = time
        System.out.println("Enter the Interest rate (per year): ");
        float R = input.nextFloat(); //R = Interest rate

        float SI = (P * T * R)/100; // SI = Simple interest
        System.out.println("P = " + P);
        System.out.println("T = " + T);
        System.out.println("R = " + R);
        System.out.println("SI = (P * T * R) / 100 = " + SI);
    }
}
