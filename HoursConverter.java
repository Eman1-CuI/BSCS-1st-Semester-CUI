import java.util.*;
public class HoursConverter{
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.print("Enter number of hours:");
    int hours=in.nextInt();
    int days=hours/24;
    int weeks=hours/(24*7);
    int remainingDays=(hours%168)/24;
    System.out.println("Total Days:" +days);
    System.out.println("Means" +weeks+ "weeks and " +remainingDays+ "days");
    }
}
