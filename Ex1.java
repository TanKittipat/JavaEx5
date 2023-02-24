
/**
 * Ex1
 */
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner Ex1 = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        float num1 = Ex1.nextFloat();
        System.out.print("Enter num2 : ");
        float num2 = Ex1.nextFloat();
        System.out.print("Enter num3 : ");
        float num3 = Ex1.nextFloat();
        System.out.print("Enter num4 : ");
        float num4 = Ex1.nextFloat();
        System.out.print("Enter num5 : ");
        float num5 = Ex1.nextFloat();
        double max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        if (max < num4) {
            max = num4;
        }
        if (max < num5) {
            max = num5;
        }
        System.out.println("The maximum value is " + max);
    }
}