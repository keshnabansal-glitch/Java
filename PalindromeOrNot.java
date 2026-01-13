//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String value = input.next(); // Used "next()" and not "nextLine()" cause if I type "HI BYE" (notice the space btw them), I will get the answer as "HIBYE")
        System.out.println("Your word is " + value);
        
        boolean isPalindrome = true;

        int last = value.length() - 1; //last = last letter's index
        for (int i = 0, j = last; i < j; i++, j--) {
            if (value.charAt(i) != value.charAt(j)) {
                    isPalindrome = false;
                    break;
            }
        }
        if(isPalindrome){
            System.out.println("Is Palindrome.");
        }
        else{
            System.out.println("Isn't Palindrome.");
        }
    }
}
