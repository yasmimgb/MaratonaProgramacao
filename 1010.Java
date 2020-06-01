import java.util.Scanner;
import java.text.DecimalFormat;
public class MyClass {
    
    public static void main(String args[]) {
     
     int A;
     int B;
     double C;
     int D;
     int E;
     double F;

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Codigo produto 01: ");
     A = sc.nextInt();
     
     System.out.println("Quantidade: ");
     B = sc.nextInt();
     
     System.out.println("Preço: ");
     C = sc.nextDouble();
     
     System.out.println("Codigo produto 02: ");
     D = sc.nextInt();
     
     System.out.println("Quantidade: ");
     E = sc.nextInt();
     
     System.out.println("Preço: ");
     F = sc.nextDouble();
     
    
     
     
    double VALOR_A_PAGAR= (B*C+E*F);
     
     
     System.out.println("VALOR A PAGAR= R$ " +new DecimalFormat("##0.00").format(VALOR_A_PAGAR));
    }
    
}
