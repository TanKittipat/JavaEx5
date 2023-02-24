import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner Ex5 = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = Ex5.nextInt();
        System.out.print("Enter Y : ");
        int y = Ex5.nextInt();
        System.out.print("Enter Z : ");
        int z = Ex5.nextInt();
        if (x > y) {
            if (x > z) {
                System.out.println("X is greater than Y and Z");
            } else {
                System.out.println("X is greater than Y but X is less than Z");
            }
        } else {
            System.out.println("X is less than Y");
        }
    }
}
