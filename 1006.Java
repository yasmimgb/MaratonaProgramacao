import java.util.Scanner;
import java.text.DecimalFormat;
public class MyClass {
    
    public static void main(String args[]) {
     
     double A;
     double B;
     double C;

     Scanner sc = new Scanner(System.in);
     
     System.out.println("1° Nota ");
     A = sc.nextDouble();
         
     System.out.println("2° Nota ");
     B = sc.nextDouble();
     
     System.out.println("3° Nota ");
     C = sc.nextDouble();
     
     double MÉDIA = ((A*2)+(B*3)+(C*5))/10.0;
     
     System.out.println("MÉDIA =" +new DecimalFormat("##0.0").format(MÉDIA ));
     
    
    }
    
}
