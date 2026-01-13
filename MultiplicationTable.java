// Take a number as input and print the multiplication table for it.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number whose multiplication you want till 10: ");
    int num = input.nextInt();
    
    for(int i=1; i<=10; i++){
        int multiple = num * i;
        System.out.println(num + " x " + i + " = " + multiple);
    }   
    }
}
