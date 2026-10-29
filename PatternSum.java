public class PatternSum {
    public static void main(String[] args) {
        int n = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print("+");
            }
            System.out.println("=" + sum);
        }
    }
}
