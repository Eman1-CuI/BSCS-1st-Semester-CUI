import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int a = sc.nextInt();
        System.out.print("Enter the number b: ");
        int b = sc.nextInt();
        System.out.print("Enter the number c: ");
        int c = sc.nextInt();
        if(a>b && a>c) {
        System.out.println("Maximum is "+a);
        }
        if(b>a && b>c){
             System.out.println("Maximum is "+b);
        }
        if(c>a && c>b) {
            System.out.println("Maximum is "+c);
        }
    }
}
