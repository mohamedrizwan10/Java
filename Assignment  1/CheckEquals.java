import java.util.Arrays;

public class CheckEquals {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 4, 0};
        int[] b = {2, 4, 5, 0, 1};

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b)); 
    }
}