import java.util.Scanner;
public class Palindromecheckerapp {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String original = scanner.nextLine();

            String reversed = "";

            // Reverse string using for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);   // String concatenation
            }

            // Compare original and reversed strings
            boolean isPalindrome = original.equals(reversed);

            // Display result
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }
    }



