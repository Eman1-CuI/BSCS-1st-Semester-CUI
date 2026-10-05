import java.util.*;
public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = in.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = in.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient= " + quotient);
        System.out.println("Remainder= " + remainder);
    }
}
