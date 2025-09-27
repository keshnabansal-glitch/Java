import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);      // 'in' is never closed so EITHER add in.close() in the end of the code (once you close it, you can't reuse it later in the program. But for small programs like yours, closing is fine.) OR try-with-resources (preffered).
        try (Scanner in = new Scanner(System.in)){
        System.out.println("Celsius to Fahrenheit Conversion");
        System.out.println("Please enter temperature in Celsious: ");
        float tempC = in.nextFloat();
        float tempF = ((tempC * 9) / 5) + 32;
        System.out.println(tempF + " " + "F");
        }
    }
}
