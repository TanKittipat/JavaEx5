import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner Ex2 = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = Ex2.nextInt();
        String ans = "";
        for (int i = 1; i <= 100; i++) {
            if (i % n == 0) {
                if (ans == "") {
                    ans = ans + i;
                } else {
                    ans = ans + "," + i;
                }

            }
        }
        System.out.println(ans + " หารด้วย " + n + " ลงตัว");
    }
}
