// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use Switch)

import java.util.Scanner;
public class Calculator_Switch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float n1 = input.nextFloat();
        System.out.println("Enter the second number: ");
        float n2 = input.nextFloat();
        System.out.println("Enter an operator (+, -, *, /): ");
        char op = input.next().charAt(0); //A way to read a character

        switch(op){
            case '+' : {
                float sum = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + sum);
                break;
            }
            case '-' : {
                if(n1>n2){
                    float sub = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + sub);
                }
                else{
                    float sub = n2 - n1;
                    System.out.println(n2 + " - " + n1 + " = " + sub);
                }
                break;
            }
            case '*' : {
                float mul = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + mul);
                break;
            }
            case '/' : {
                if(n2!=0){
                    float div = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + div);
                }
                else{
                    System.out.println("Can't divide a number by 0.");
                }
                break;
            }
            default: {
                System.out.println("Operator should be from +, -, * and / only!");
            }
        }
    }
}
