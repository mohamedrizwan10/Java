public class CheckPalindrome {
    public static void main(String[] args) {
        int num = -121;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        int original = num, reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }
}