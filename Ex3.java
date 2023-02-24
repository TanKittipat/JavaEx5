import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner Ex3 = new Scanner(System.in);
        System.out.print("ใส่รัศมี : ");
        float r = Ex3.nextFloat();
        System.out.print("ใส่ความสูง : ");
        float h = Ex3.nextFloat();
        System.out.print("ใส่หน่วย : ");
        String types = Ex3.next();
        double area = 3.14 * (r * r) * h;
        System.out.println("ปริมาตรทรงกระบอกคือ " + area + " " + types);
    }
}
