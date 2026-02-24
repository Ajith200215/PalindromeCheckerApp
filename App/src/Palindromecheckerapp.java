import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class Palindromecheckerapp {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            // Create a Deque to store characters
            Deque<Character> deque = new ArrayDeque<>();

            // Insert characters into deque
            for (int i = 0; i < input.length(); i++) {
                deque.addLast(input.charAt(i));  // Insert at rear
            }

            boolean isPalindrome = true;

            // Compare front and rear elements until deque is empty or mismatch found
            while (deque.size() > 1) {

                char front = deque.removeFirst(); // Remove from front
                char rear = deque.removeLast();   // Remove from rear

                if (front != rear) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }





    }




