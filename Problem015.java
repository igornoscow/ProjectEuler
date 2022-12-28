//very slow algorithm
public class Problem015 {
    public static void main(String[] args) {
        System.out.println(routes(0,0));
    }

    public static long routes(int x, int y) {
        long deep;
        if (x == 20 && y == 20) {
            deep = 1;
        } else {
            deep = 0;
        }
        if (x < 20) {
            deep = deep + routes(x + 1, y);
        }
        if (y < 20) {
            deep = deep + routes(x, y + 1);
        }
        return deep;
    }
}
