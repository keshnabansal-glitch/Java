// Input currency in rupees and output in USD.

import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        float rupee = input.nextFloat();
        float usd = rupee * 0.0111f;
        System.out.println(rupee + " in USD is " + usd);
    }
}
