import java.util.Scanner;

public class PositiveNegative { // Class name starts with a capital letter

  public static void main(String[] args) {
    // Get a number from the user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double number = scanner.nextDouble();
    scanner.close(); // Close the scanner resource

    // Check the number and display the result
    if (number > 0) {
      System.out.println(number + " is a positive number.");
    } else if (number < 0) {
      System.out.println(number + " is a negative number.");
    } else {
      System.out.println(number + " is zero.");
    }
  }
}