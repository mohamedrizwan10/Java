import java.util.Arrays;

public class RotateAntiClockwise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1;

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr)); 
    }
}