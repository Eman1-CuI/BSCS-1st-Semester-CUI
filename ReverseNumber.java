import java.util.*;
public class ReverseNumber{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
System.out.print("Enter a five digit number:"); 
int num=in.nextInt();
int reverse=0;
int temp=num;
while(temp!=0){
    int digit=temp%10;
    reverse=(reverse*10)+digit;
    temp/=10;
}
System.out.println("Reverse is" +reverse);
}
}
