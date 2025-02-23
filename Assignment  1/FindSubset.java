import java.util.HashSet;

public class FindSubset {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b));
    }

    public static boolean isSubset(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) set.add(num);

        for (int num : b) {
            if (!set.contains(num)) return false;
        }
        return true;
    }
}