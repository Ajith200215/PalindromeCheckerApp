import java.util.Scanner;

public class Palindromecheckerapp {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read full line input
            String input = sc.nextLine();

            // Normalize string (remove spaces and convert to lowercase)
            String cleaned = input.replaceAll("\\s+", "").toLowerCase();

            // Reverse the cleaned string
            String reversed = new StringBuilder(cleaned).reverse().toString();

            // Check palindrome
            boolean isPalindrome = cleaned.equals(reversed);

            // Output format
            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? " + isPalindrome);

            sc.close();
        }
    }















