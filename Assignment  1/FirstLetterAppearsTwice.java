import java.util.HashSet;

public class FirstLetterAppearsTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                System.out.println(c); 
                return;
            }
            seen.add(c);
        }
    }
}