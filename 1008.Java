import java.util.Scanner;
import java.text.DecimalFormat;
public class MyClass {
    
    public static void main(String args[]) {
        
     
     int A;
     int B;
     double C;

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite o primeiro número:");
     A = sc.nextInt();
     
     System.out.println("Quantidade de aulas: ");
     B = sc.nextInt();
     
     System.out.println("Valor por hora: ");
     C = sc.nextDouble();
     
    
     
     int Número = A;
     double Salário = B*C;
     
     System.out.println("Número = " + Número);
     System.out.println("Salário = R$" + new DecimalFormat("##0.00").format(Salário));
    }
    
}
