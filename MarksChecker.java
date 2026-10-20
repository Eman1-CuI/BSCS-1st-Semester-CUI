import java.util.*;
public class MarksChecker{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a marks of S1:");
        int S1=in.nextInt();
        System.out.print("Enter a marks of S2:");
        int S2=in.nextInt();
        System.out.print("Enter a marks of S3:");
        int S3=in.nextInt();
        int average= (S1+S2+S3)/3;
        System.out.println("Average=" +average);
        if(average>80){
            System.out.println("You are above Standard!");
                        System.out.print("Admission granted");
        }
    }
}
