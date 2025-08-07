package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Radius = ");
    double radius = sc.nextDouble();
    double perimeter = Math.PI * 2 * radius;
    double area = Math.PI * (radius * radius);
    System.out.println("Perimeter is = " + perimeter);
    System.out.println("Area is = " + area);
    sc.close();
  }
}
