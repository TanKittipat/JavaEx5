
/**
 * Ex7
 */
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner Ex7 = new Scanner(System.in);
        System.out.print("Enter time(Hours) : ");
        float time = Ex7.nextFloat();
        System.out.print("Enter overtime(Hours) : ");
        float ot = Ex7.nextFloat();
        System.out.print("Enter rate per hour : ");
        float rate = Ex7.nextFloat();
        double payment = time * rate;
        double otpayment = payment * 1.5;
        double total = payment + otpayment;
        System.out.println("ค่าจ้างปกติ " + payment);
        System.out.println("ค่าจ้างล่วงเวลา " + otpayment);
        System.out.println("รวม = " + total);

    }
}