import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in celcius:");

        float tempC = in.nextFloat();


        float tempF =  (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
