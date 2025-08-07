package fa.training.assignment2;

import java.util.Scanner;

public class CylinderComputation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Radius: ");
    double radius = sc.nextDouble();
    System.out.print("Height: ");
    double height = sc.nextDouble();
    double surfaceArea = 2 * Math.PI * radius * (height + radius);
    double baseArea = Math.PI * radius * radius;
    double volume = Math.PI * radius * radius * height;
    System.out.println("Surface area = " + surfaceArea);
    System.out.println("Base area = " + baseArea);
    System.out.println("Volume = " + volume);
    sc.close();
  }

}
