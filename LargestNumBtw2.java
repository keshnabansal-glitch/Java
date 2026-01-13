// Take 2 numbers as input and print the largest number also print by how much the number is greater than the other.

import java.util.Scanner;

public class LargestNumBtw2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float n1 = input.nextFloat();
        System.out.println("Enter another number: ");
        float n2 = input.nextFloat();

        float diff;
        if(n1>n2){
            diff = n1 - n2; //diff = difference
            System.out.println( n1 + " is greater than " + n2 + " by " + diff + ".");
        }
        else if(n1<n2){
            diff = n2 - n1; //diff = difference
            System.out.println( n2 + " is greater than " + n1 + " by " + diff + ".");
        }
        else{
            System.out.println(n1 + " & " + n2 + " are equal.");
        }
    }
}
