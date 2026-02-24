import java.util.Scanner;
public class Palindromecheckerapp {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String word = scanner.nextLine();

            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            boolean isPalindrome = word.equals(reversed);

            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }
    }


