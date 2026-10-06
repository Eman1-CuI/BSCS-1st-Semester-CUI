
import java.util.*;
public class SwappingWithoutTemp{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
System.out.print("Enter first num:"); 
int a =in.nextInt();
System.out.print("Enter second num:");
int b=in.nextInt();
System.out.println("Before Swapping:a=" +a+ ",b=" +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping:a=" +a+ ",b=" +b);
}
}
