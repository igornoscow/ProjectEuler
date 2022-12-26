import java.util.ArrayList;
import java.util.List;

public class Problem003 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        long number = Long.parseLong("600851475143");
        long copyNumber;
        long i = 2;
        boolean match = false;

        while (true) {
            if (number % i == 0) {
                for (long prime:list) {
                    if (i % prime == 0) {
                        match = true;
                        break;
                    }
                }
                if (!match) {
                    list.add(i);
                    copyNumber = number;
                    for (long prime:list) {
                        copyNumber = copyNumber / prime;
                    }
                    if (copyNumber == 1) {
                        break;
                    }

                } else {
                    match = false;
                }
            }

            i++;
        }

        System.out.println(list.get(list.size()-1));
    }
}
