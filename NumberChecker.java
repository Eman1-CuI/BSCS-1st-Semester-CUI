import java.util.*;
public class NumberChecker{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n=in.nextInt();
        if(n>0){
            System.out.print("Positive");
        }else if(n<0){
            System.out.print("Negative");
        }else{
            System.out.print("Zero");
        }
    }
}
