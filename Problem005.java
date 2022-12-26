public class Problem005 {
    public static void main(String[] args) {
        int baseNumber = 20*19*17*13*11*7*3;
        int number = baseNumber;
        boolean b = false;

        while (true) {
            for (int i=18; i>=3; i--) {
                if (number % i != 0) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                break;
            }
            else {
                b = false;
            }
            number = number + baseNumber;
        }

        System.out.println(number);
    }
}
