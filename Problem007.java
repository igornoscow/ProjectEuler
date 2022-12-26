import java.util.ArrayList;
import java.util.List;

public class Problem007 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        boolean b;

        while (list.size() < 10001) {
            b = false;
            for (int prime: list) {
                if (i % prime == 0) {
                    b = true;
                }
            }
            if (!b) {
                list.add(i);
            }
            i++;
        }

        System.out.println(list.get(10000));
    }
}
