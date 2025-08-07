package fa.training.assignment2;

import java.util.Scanner;

public class ArithmeticOperators {

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
    System.out.print("Input fifth number: ");
    int num5 = sc.nextInt();
    int sum = num1 + num2 + num3 + num4 + num5;
    System.out.println("The sum is: " + sum);
    sc.close();
  }
}
