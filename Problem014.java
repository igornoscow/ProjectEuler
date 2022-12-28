//bad algorithm, change later
public class Problem014 {
    public static void main(String[] args) {
        int maxChain = 0;
        int maxNumber = 1;
        long number;
        int chain;

        for (int i = 0; i < 1000000; i++) {
            number = i;
            chain = 1;
            while (number > 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = number * 3 + 1;
                }
                chain++;
            }
            if (chain > maxChain) {
                maxChain = chain;
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);
    }
}
