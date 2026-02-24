import java.util.Stack;
import java.util.Scanner;
public class Palindromecheckerapp {





        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            // Create a Stack of Characters
            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            boolean isPalindrome = true;

            // Pop from stack and compare
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack.pop()) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }



    }




