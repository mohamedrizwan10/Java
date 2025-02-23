import java.util.HashSet;

public class MissingandRepeated {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeated(arr);
    }

    public static void findMissingAndRepeated(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int repeated = -1, sum = 0;

        for (int num : arr) {
            if (!set.add(num)) repeated = num;
            sum += num;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (sum - repeated);

        System.out.println("Missing is " + missing + " and repeated is " + repeated);
    }
}