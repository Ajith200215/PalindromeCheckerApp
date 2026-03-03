
import java.util.Stack;
import java.util.Scanner;

public class Palindromecheckerapp {


        public boolean checkPalindrome(String str) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != stack.pop()) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Palindromecheckerapp obj = new Palindromecheckerapp();

            String input = sc.nextLine();   // No extra print statement

            boolean result = obj.checkPalindrome(input);

            System.out.println("Input : " + input);
            System.out.println("Output : " + result);

            sc.close();
        }
    }


















