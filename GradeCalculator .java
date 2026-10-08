import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int per = in.nextInt();
        if(per >= 90){
        System.out.println("Grade: A+");
        }else if(per >= 80){
        System.out.println("Grade: A");
        }else if(per >= 70){
        System.out.println("Grade: B");
        }else if(per >= 60){
        System.out.println("Grade: C");
        }else if(per >= 50){
        System.out.println("Grade: D");
        }else{
        System.out.println("Grade: F - Fail");
        }
    }
}
