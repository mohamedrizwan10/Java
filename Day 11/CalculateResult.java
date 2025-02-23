import java.util.Scanner;

public class CalculateResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.print("Enter the value of OPT (1 or 2): ");
        int OPT = scanner.nextInt();
        
        int result = 0;
        
        if (OPT == 1) {
            result = N - (N - 1) + (N - 2) - (N - 3) + (N - 4) - 1;
        } else if (OPT == 2) {
            result = N + (N - 1) - (N - 2) + (N - 3) - (N - 4) +  1;
        } else {
            System.out.println("Invalid OPT value. Please enter 1 or 2.");
            scanner.close();
            return;
        }
        
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
