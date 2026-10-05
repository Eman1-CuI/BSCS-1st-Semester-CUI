import java.util.*;
public class PrintBill{
    public static void main(String args[]){
     Scanner in=new Scanner(System.in);
     final double MONOCHROME_RATE=2.50;
     final double MONOCHROME_COLOR=8.0;
     final double BINDING=40.0;
     final double TAX=0.05;
     System.out.print("Enter a monochromePage:");
     int monochromePage=in.nextInt();
     System.out.print("Enter a monochromeColor:");
     int monochromeColor=in.nextInt();
     double Mono=monochromePage*MONOCHROME_RATE;
     double Colour=monochromeColor*MONOCHROME_COLOR;
     double Subtotal=Mono+Colour+BINDING;
     double Tax=Subtotal*TAX;
     double Total=Tax+Subtotal;
     System.out.printf(java.util.Locale.US,"Mono: %.2f%n",Mono); 
     System.out.printf(java.util.Locale.US,"Colour: %.2f%n",Colour); 
     System.out.printf(java.util.Locale.US,"Subtotal: %.2f%n",Subtotal); 
     System.out.printf(java.util.Locale.US,"Tax: %.2f%n",Tax); 
      System.out.printf(java.util.Locale.US,"Total: %.2f%n",Total); 
    }
}
