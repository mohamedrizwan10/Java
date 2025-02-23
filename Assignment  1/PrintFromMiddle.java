public class PrintFromMiddle {
    public static void main(String[] args) {
        String str = "PROGRAM";
        int mid = str.length() / 2;

        for (int i = mid; i < str.length(); i++) {
            System.out.println(str.substring(mid, i + 1));
        }
    }
}