import java.util.Scanner;
public class MultipleChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer a: ");
        int a = sc.nextInt();
         System.out.print("Enter the integer b: ");
        int b = sc.nextInt();
        if(a % b == 0) {
            System.out.println("First is multiple of second");
        }else {System.out.println("First is not multiple of second");
    }
}
}
