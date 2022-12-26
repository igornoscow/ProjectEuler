public class Problem004 {
    public static void main(String[] args) {
        int number = 999*999;
        int n1;
        int n2;
        boolean b = false;

        while (!b) {
            n1 = number / 1000;
            n2 = number % 10 * 100 + number % 100 / 10 * 10 + number % 1000 / 100;

            if (n1 == n2) {
                for (int i=999; i > 300; i--) {
                    if (number % i == 0 && number/i <= 999) {
                        b = true;
                        System.out.println(i);
                        break;
                    }
                }
            }
            number--;
        }
        number++;
        System.out.println(number);
    }
}
