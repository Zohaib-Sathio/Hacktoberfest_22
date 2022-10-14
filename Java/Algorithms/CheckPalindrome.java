import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String value = input.nextLine();
      String temp = "";
      
      for (int i = value.length() - 1; i >= 0; i--) {
        temp = temp + (value.charAt(i));
      }
      System.out.println("Result: " + temp + "\n");
      
      int j = 0;
      if (j < value.length() / 2) {
        if (value.charAt(j) != value.charAt(value.length() - 1)) {
            System.out.println("Not Palindrome");
        } else {
            System.out.println("Palindrome");
        }
      }
    }
}
