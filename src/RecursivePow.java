public class RecursivePow {
    static int pow(int x, int r) {
        if (r == 0) return 1;
        if (r == 1) return x;

        return pow(x , r - 1) * x;
    }
}
