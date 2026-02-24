import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Palindromecheckerapp {




        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            // Create Stack (LIFO)
            Stack<Character> stack = new Stack<>();

            // Create Queue (FIFO)
            Queue<Character> queue = new LinkedList<>();

            // Enqueue and Push characters
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                stack.push(ch);     // LIFO
                queue.add(ch);      // FIFO (enqueue)
            }

            boolean isPalindrome = true;

            // Compare dequeue (queue) vs pop (stack)
            while (!stack.isEmpty() && !queue.isEmpty()) {

                char fromStack = stack.pop();     // LIFO removal
                char fromQueue = queue.remove();  // FIFO removal (dequeue)

                if (fromStack != fromQueue) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }


    }




