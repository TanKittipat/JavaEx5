import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner Ex4 = new Scanner(System.in);
        System.out.print("ใส่เวลาโทร : ");
        int time = Ex4.nextInt();
        int price;
        if (time <= 2) {
            price = time * 5;
        }
        price = 10 + (time - 2) * 2;

        System.out.println("ค่าโทร = " + price);
    }
}
