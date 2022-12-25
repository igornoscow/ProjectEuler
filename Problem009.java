public class Problem9 {
    public static void main(String[] args) {
        int result = 0;

        for (int i=499; i>332; i--) {
            for (int j=1000-2*i; j>500-i; j--) {
                if (i*i + j*j == (1000-j-i)*(1000-j-i)) {
                    result = i*j*(1000-j-i);
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
