import java.util.Scanner;

public class Ex6 {

  public static void main(String[] args) {
    Scanner Ex6 = new Scanner(System.in);
    System.out.print("Enter amount of water(Liter) : ");
    float Liter = Ex6.nextFloat();
    System.out.print("Enter customer type (Domestic,Commercial) : ");
    String types = Ex6.next();
    double total;
    double base = 100;
    if (types.equalsIgnoreCase("Domestic")) {
      total = (Liter * 0.5) + base;
      System.out.println("Price of water is " + total + "฿");
    } else if (types.equalsIgnoreCase("Commercial")) {
      total = (Liter * 0.9) + base;
      System.out.println("Price of water is " + total + "฿");
    } else {
      System.out.println("Customer type not match");
    }
  }
}
