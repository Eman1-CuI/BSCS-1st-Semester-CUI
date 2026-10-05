import java.util.*;
public class AgeCalculator{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the age in years:");
    int year=in.nextInt();
    int months=year*12;
    int days=year*365;
    System.out.println("Age in Month:" +months);
    System.out.println("Age in days:" +days);
    }
}
