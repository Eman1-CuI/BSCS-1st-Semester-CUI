public class SeriesSum {
    public static void main(String[] args) {
        double sum = 1.0;
        int i = 2;
        while (i <= 100) {
            sum += 1.0 / i;
            i += 2;
        }
        System.out.println("Sum of series = " + sum);
    }
}
