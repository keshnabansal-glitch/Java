// Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;

public class HCFandLCM {

    static int HCF(int x, int y){
    int remainder;
    while(x!=0){
        remainder = y%x;
        y=x;
        x=remainder;
    }
    return y;
    } 

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int hcf = HCF(a,b);
        System.out.println("HCF = " + hcf);

        int lcm = (a*b)/hcf;
        System.out.print("LCM = " + lcm);
    }
}
