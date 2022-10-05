import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String value = input.nextLine();
      String temp = "";
      
      for (int i = value.length() - 1; i >= 0; i--) {
        temp = temp + (value.charAt(i));
      }
      System.out.println(temp);
    }
}
