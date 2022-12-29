import java.math.BigInteger;

public class Problem016 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("2");
        String string;
        int sum = 0;

        for (int i=2; i <= 1000; i++) {
            number = number.add(number);
        }
        string = number.toString();
        for (char c: string.toCharArray()) {
            sum = sum + Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}