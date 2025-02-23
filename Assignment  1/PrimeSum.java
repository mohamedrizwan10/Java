import java.util.Scanner;

public class PrimeSum {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter L and R: ");
        int L = sc.nextInt(), R = sc.nextInt(), sum = 0;
        for (int i = L; i <= R; i++) if (isPrime(i)) sum += i;
        System.out.println("Sum of primes: " + sum);
        sc.close();
    }
}
