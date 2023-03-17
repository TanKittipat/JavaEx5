import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner Ex9 = new Scanner(System.in);
        System.out.print("ระบุชื่อ : ");
        String name = Ex9.nextLine();
        int birth;
        int years;
        do {
            System.out.print("ระบุปีเกิด(พ.ศ.) : ");
            birth = Ex9.nextInt();
            if (birth >= 2566) {
                System.out.println("ท่านระบุข้อมูลผิด");
            }
        } while (birth >= 2566);
        years = 2566 - birth;
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("ชื่อ " + name);
        System.out.println("ปีเกิด " + birth);
        System.out.println("อายุ " + years);
    }
}
