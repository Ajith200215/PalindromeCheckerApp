import java.util.Scanner;

public class Palindromecheckerapp {



        // Recursive function to check palindrome
        private static boolean isPalindrome(String str, int start, int end) {

            // Base condition: crossed pointers or single character left
            if (start >= end) {
                return true;
            }

            // Compare start and end characters
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            // Recursive call for inner substring
            return isPalindrome(str, start + 1, end - 1);
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            // Call recursive palindrome checker
            boolean result = isPalindrome(input, 0, input.length() - 1);

            // Display result
            System.out.println("Is it a Palindrome? : " + result);

            scanner.close();
        }
    }













