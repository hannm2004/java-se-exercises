package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Width = ");
    double width = sc.nextDouble();
    System.out.print("Height = ");
    double height = sc.nextDouble();
    double area = width * height;
    double perimeter = (width + height) * 2;
    System.out.println("Area is: "  + area);
    System.out.println("Perimeter is: " + perimeter);
    sc.close();
  }
}
