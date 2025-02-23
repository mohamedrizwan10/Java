import java.util.Scanner;

public class AlternatingSum {
    
    public static int calculateResult(int n, int opt) {
        int result = 0;
        boolean isSubtract = (opt == 1);
        
        for (int i = n; i >= 1; i--) {
            if (isSubtract) {
                result -= i;
            } else {
                result += i;
            }
            isSubtract = !isSubtract;
        }
        
        return (opt == 1) ? result * -1 : result; 
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value of N: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter option (1 or 2): ");
        int opt = scanner.nextInt();
        
        if (opt != 1 && opt != 2) {
            System.out.println("Invalid option! Choose 1 or 2.");
        } else {
            int result = calculateResult(n, opt);
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}
