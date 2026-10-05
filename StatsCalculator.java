import java.util.*;
public class StatsCalculator{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter a first number:");
    int a=in.nextInt();
    System.out.print("Enter a second number:");
    int b=in.nextInt();
    System.out.print("Enter a third number:");
    int c=in.nextInt();
    System.out.print("Enter a fourth number:");
    int d=in.nextInt();
    int addition=a+b+c+d;
    System.out.println("Addition=" +addition);
    int product=a*b*c*d;
    System.out.println("Product=" +product);
    double average=(a+b+c+d)/4.0;
    System.out.println("Average=" +average);
}
}
