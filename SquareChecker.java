import java.util.*;
public class SquareChecker{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number a:");
        int a=in.nextInt();
        System.out.print("Enter a number b:");
        int b=in.nextInt();
        if(b==a*a){
            System.out.print("Second is a square of first");
        }else{
             System.out.print("Second is not a square of first");
        }
    }
}
