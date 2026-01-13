// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class SumUntilXInput {
    public static void main(String[] args){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter a number or press \"x\" to stop: ");
        while(true){
            System.out.println("Enter a number or press \"x\" to stop: ");
            String num = input.next();
            if(num.equals("x")){
                break;
            }
            else{
                sum+= Integer.parseInt(num); // Used to convert String into an Integer/a Number.
            }
            System.out.println("Sum = " + sum);
        }
    }
}
