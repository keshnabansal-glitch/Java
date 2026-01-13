// To find Armstrong Number between two given number. (for 3 digitis)
/*
import  java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = input.nextInt();

        int temp = n1;
        int sum = 0;

        while(temp!=0){
            int digit = temp % 10;
            sum += digit*digit*digit;
            temp /= 10;
        }
        if(sum == n1){
            System.out.println("It is an armstrong number.");
        }
        else{
            System.out.println("It is NOT an armstrong number.");
        }
    }
}
*/

// Armstrong Numbers between two given numbers (ANY digits)
import  java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start = input.nextInt();
        System.out.println("Enter the ending number: ");
        int end = input.nextInt();
        System.out.println("Starting = " + start);
        System.out.println("Ending = " + end);

        for(int num = start; num <= end; num++){
            int temp = num;
            int digits = 0;
            
            // counting the number of digits.
            while(temp!=0){ 
                digits++;
                temp/=10;
            }

            // as "temp" was destroyed in the previous step. Hence, reassigning the value of "temp" back to "num" again.
            temp = num;

            // Armstrong logic
            int sum = 0;
            while(temp!=0){
                int digit = temp % 10;
                sum += (int) Math.pow(digit,digits); // Math.pow() returns a double value but "sum" is an integer.
                temp /= 10;
            }
            if(sum==num){
                System.out.println(num);
            }
        }
    }
}