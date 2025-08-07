import java.util.Scanner;

public class LogicalOperators {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input first number: ");
    int num1 = sc.nextInt();
    System.out.print("Input second number: ");
    int num2 = sc.nextInt();
    System.out.print("Input third number: ");
    int num3 = sc.nextInt();
    System.out.print("Input fourth number: ");
    int num4 = sc.nextInt();
    if (num1 == num2 && num1 == num3 && num1 == num4) {
      System.out.println("Numbers are equal!");
    } else {
      System.out.println("Numbers are not equal!");
    }
    sc.close();
  }
}
