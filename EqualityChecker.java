import java.util.*;
public class EqualityChecker{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number a:");
        int a= sc.nextInt();
        System.out.print("Enter a number b:");
        int b= sc.nextInt();
        if(a==b){
            System.out.print("Equal");
        }else{
            System.out.print("Not Equal");
        }
    }
}
