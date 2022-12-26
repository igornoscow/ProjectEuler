//awful algorithm. change later
public class Problem012 {
    public static void main(String[] args) {
        int n = 2;
        int nDecrement = 1;
        int n1 = 1;
        int n2 = 3;
        int n3 = 0;
        int countFactors = 0;

        while (countFactors < 500) {
            countFactors = 0;
            n3 = n2 + n1 +n;
            for (int i = 1; i <= n3; i++) {
                if (n3 % i == 0) {
                    countFactors++;
                }
            }
            System.out.println(n3 + " " + countFactors);
            n = n - nDecrement;
            nDecrement++;
            n1 = n2;
            n2 = n3;
        }
    }
}
