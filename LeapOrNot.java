// Input a year and find whether it is a leap year or not.
import java.util.Scanner;

public class LeapOrNot{
    public static void main(String[] args){
        Scanner yr = new Scanner(System.in);
        System.out.println("Enter an year: ");
        int year = yr.nextInt();
        System.out.println("The year you typed is: " + year );

        if(((year%4 == 0 ) && (year%100 != 0)) || (year%400 == 0)){
            System.out.println("YES. The year " + year + " is a leap year!");
        }
        else{
            System.out.println("NO. The year " + year + " is NOT a  leap year!");
        }
    }
}