import java.util.Scanner;

public class CountOccurrence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
    int number = input.nextInt();
    int originalNumber = number;
        System.out.print("Enter the number you want to count: ");
        int countNum = input.nextInt();
        int count =0;
        while(number>0){
            int remainder = number % 10;
            if(remainder==countNum){
                count++;
            }
            number = number/10;
        }
    System.out.print("The count for number '" + countNum + "' in the number '" + originalNumber + "' is: " + count);
    }
}

