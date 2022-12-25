public class Problem1 {
    public static void main(String[] args) {
        int a3 = 999 / 3;
        int a5 = 999 / 5;
        int a15 = 999 / (3*5);

        int sum3 = (3 + a3*3)*a3/2;
        int sum5 = (5 + a5*5)*a5/2;
        int sum15 = (15 + a15*15)*a15/2;
        int sum = sum3 + sum5 - sum15;
        System.out.println(sum);
    }
}
