public class StringToNumber {
    public static void main(String[] args) {
        String input = "hello"; 
        int asciiSum = convertToNumber(input);
        System.out.println("ASCII value sum: " + asciiSum);
    }

    public static int convertToNumber(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) c;  
        }
        return sum;
    }
}
