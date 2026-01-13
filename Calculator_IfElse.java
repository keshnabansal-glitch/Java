// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calculator_IfElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operator ('+' OR '-' OR '*' OR '/' OR '^' OR '%')\nOR\npress 'x' OR 'X' to exit:");
        
        while(true){
            char operator = input.next().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^' || operator == '%'){
                if(operator == '+'){
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    int num2 = input.nextInt();
                    int add = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + add);
                }
                else if(operator == '-'){
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    int num2 = input.nextInt();
                    int sub = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + sub);
                }
                else if(operator == '*'){
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    int num2 = input.nextInt();
                    int mul = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + mul);
                }
                else if(operator == '/'){
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter another number: ");
                    int num2 = input.nextInt();
                    if(num2 != 0){
                        int div = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + div);
                    }
                    else{
                        System.out.println("Can't divide " + num1 + " with 0");
                    }
                }
                else if(operator == '^'){
                    System.out.print("Enter a number: ");
                    int base = input.nextInt();
                    System.out.print("Enter the exponent: ");
                    int exponent = input.nextInt();
                    double power = Math.pow(base, exponent);
                    System.out.println(base + " ^ " + exponent + " = " + power);
                }
                else if(operator == '%'){
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    System.out.print("Enter the exponent: ");
                    int num2 = input.nextInt();
                    if(num2 != 0){
                        int mod = num1 % num2;
                        System.out.println(num1 + " % " + num2 + " = " + mod);
                    }
                    else{
                        System.out.println("Can't divide " + num1 + " with 0");
                    }
                }
            }
            else if(operator == 'x' || operator == 'X'){
                    break;
                }
            else{
                System.out.println("Please enter the mentioned operators only!");
            }
        }
    }
}
