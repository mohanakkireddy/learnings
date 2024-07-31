import java.util.Scanner;

public class Palindrome {

        public static boolean isPalindrome(int x) {
            // Negative numbers are not palindromes
            if (x < 0) {
                return false;
            }

            int originalNum = x;
            int reversedNum = 0;

            while (x != 0) {
                int remainder = x % 10;
                reversedNum = reversedNum * 10 + remainder;
                x /= 10;
            }

            return originalNum == reversedNum;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int x = input.nextInt();
            input.close();

            boolean result = isPalindrome(x);
            System.out.println(x + " is a palindrome: " + result);
        }
    }


