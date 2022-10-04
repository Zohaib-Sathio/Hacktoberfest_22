// Program Written by minhaj-313
import java.util.Scanner;
public class BMI_calculator 
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("\nEnter height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
   }
}