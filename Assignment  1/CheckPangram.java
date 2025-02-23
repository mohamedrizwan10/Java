public class CheckPangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog".toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true); 
    }
}