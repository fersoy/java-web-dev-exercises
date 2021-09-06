package exercises;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?: ");
        int miles = input.nextInt();

        System.out.println("How many gallon have you used for this travel?: ");
        int gallons = input.nextInt();

        System.out.println("You are driving with " + miles/gallons + " mpg.");


    }
}
