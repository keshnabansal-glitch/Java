// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class Fibonacci{
    public void fibo(int num){
        int a = 0;
        int b = 1;
        for(int i=0;i<num;i++){
            System.out.print(a+ " "); //prin a's first before it changes.
            int series = a + b;
            b=a;
            a=series;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number till where you want your fibonacci series:");
        int n = input.nextInt();

        Fibonacci f = new Fibonacci();
        f.fibo(n);
    }
}