import java.util.*;
public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int a = in.nextInt();
        System.out.print("Enter second num: ");
        int b = in.nextInt();
        System.out.println("Before Swapping: a=" + a + ", b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a=" + a + ", b=" + b);
    }
}
