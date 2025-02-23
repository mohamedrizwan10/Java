import java.util.Scanner;

public class ShiftAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.print("Enter the letters (A-Z, a-z): ");
        String input = scanner.nextLine();

        // Get the integer shift value
        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();

        // Process and print the shifted output
        System.out.print("Shifted Output: ");
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char shiftedChar = (char) (((ch - 'A' + shift) % 26 + 26) % 26 + 'A');
                System.out.print(shiftedChar);
            } else if (Character.isLowerCase(ch)) {
                char shiftedChar = (char) (((ch - 'a' + shift) % 26 + 26) % 26 + 'a');
                System.out.print(shiftedChar);
            } else {
                // If it's not a letter, print it as is
                System.out.print(ch);
            }
        }
        scanner.close();
    }
}