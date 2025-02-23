import java.util.HashMap;

public class DistinctSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3};
        System.out.println(findDistinctSum(arr));
    }

    public static int findDistinctSum(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1) { 
                sum += key;
            }
        }
        return sum;
    }
}