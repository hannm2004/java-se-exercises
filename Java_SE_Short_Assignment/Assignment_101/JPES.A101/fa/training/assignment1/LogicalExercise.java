package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input first integer: ");
    int num1 = sc.nextInt();
    System.out.print("Input second integer: ");
    int num2 = sc.nextInt();
    if(num1 == num2)
      System.out.printf("%d==%d\n", num1, num2);
    if(num1 != num2)
      System.out.printf("%d!=%d\n", num1, num2);
    if(num1 < num2)
      System.out.printf("%d<%d\n", num1, num2);
    if(num1 > num2)
      System.out.printf("%d>%d\n", num1, num2);
    if(num1 <= num2)
      System.out.printf("%d<=%d\n", num1, num2);
    if(num1 >= num2)
      System.out.printf("%d>=%d\n", num1, num2);
    sc.close();
  }
}
