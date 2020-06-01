import java.util.Scanner;
import java.text.DecimalFormat;
public class MyClass {
    
    public static void main(String args[]) {
     
     String A;
     double B;
     double C;

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Nomo do vendedor: ");
     A = sc.nextLine();
     
     System.out.println("Salário fixo: ");
     B = sc.nextDouble();
     
     System.out.println("Total de venda: ");
     C = sc.nextDouble();
     
    
     
     String Vendedor = A;
     double TOTAL = B+(C*15/100);
     
     System.out.println("Vendedor = " + A);
     System.out.println("TOTAL = R$ " + new DecimalFormat("##0.00").format(TOTAL));
    }
    
}
