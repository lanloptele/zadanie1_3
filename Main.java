import java.util.Scanner;
import java.lang.Math;
public class Main{
  

    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe:");
        double a = scan.nextDouble();
         System.out.println("Podaj druga liczbe:");
        double b = scan.nextDouble();
      a = Math.sqrt(a);
      b = Math.sqrt(b);
      
      double suma = a + b;
        System.out.println("suma pierwiastkow to:" + suma);
      }
      
    }
    
    
    
    
    
   
  
