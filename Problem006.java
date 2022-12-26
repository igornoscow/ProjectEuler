public class Problem006 {
    public static void main(String[] args) {
        int sum1 = 100 * (100+1) * (2*100+1) / 6;
        int sum2 = (int) Math.pow((1+100)*100/2,2);
        System.out.println(sum2 - sum1);
    }
}
