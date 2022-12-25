public class Problem2 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        int sum = 0;

        while (n3 <= 4000000) {
            sum = sum + n3;
            n1 = n2 + n3;
            n2 = n3 + n1;
            n3 = n1 + n2;
        }

        System.out.println(sum);
    }
}
