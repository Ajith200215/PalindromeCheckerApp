import java.util.Scanner;
import java.util.LinkedList;

public class Palindromecheckerapp {





        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input text: ");
            String input = scanner.nextLine();

            // Convert string to LinkedList<Character>
            LinkedList<Character> list = new LinkedList<>();
            for (char ch : input.toCharArray()) {
                list.add(ch);
            }

            boolean isPalindrome = true;

            // Use two-pointer approach with indices
            int start = 0;
            int end = list.size() - 1;

            while (start < end) {
                if (!list.get(start).equals(list.get(end))) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Print result
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }
    }










