import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = a, temp = b;
        while (temp != 0) { int t = temp; temp = gcd % temp; gcd = t; }
        System.out.println("LCM: " + (a * b) / gcd);
        sc.close();
    }
}
