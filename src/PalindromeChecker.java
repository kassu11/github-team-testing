import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String transformed = transformInput(input);
    
        boolean isPalindrome = checkPalindrome(transformed);
        if (isPalindrome) System.out.println("The transformed input is a palindrome.");
        else System.out.println("The transformed input is not a palindrome.");
    }

    public static String transformInput(String input) {
        // Remove punctuation and convert the input to lowercase.
        input = input.toLowerCase();
        input = input.replace(",", "");
        input = input.replace("!", "");
        return input;
    }

    public static boolean checkPalindrome(String input) {
        // Reverse the input and compare it to the original input.
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        // Reverse the input by constructing a new String with the characters
        // in reverse order.
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}