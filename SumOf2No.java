// Take two numbers and print the sum of both.

import java.util.Scanner;

public class SumOf2No{
    static int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        int sum=add(a,b);
        System.out.println(a + " + " + b + " = " + sum);
    }
}
