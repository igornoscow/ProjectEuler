import java.util.ArrayList;
import java.util.List;

public class Problem10 {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();
        boolean notPrime;
        long sum = 0;

        for (int i=2; i<2000000; i++) {
            notPrime = false;
            for (int prime: primes) {
                if (i % prime == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (!notPrime) {
                System.out.println(i);
                primes.add(i);
            }
        }

        for (int prime: primes) {
            sum = sum + prime;
        }
        System.out.println(sum);

    }
}
