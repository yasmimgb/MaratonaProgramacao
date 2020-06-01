import java.util.Scanner;
public class MyClass {
    
    public static void main(String args[]){
        
      Scanner sc = new Scanner(System.in);
      float A,B,C,D,R1,R2;
    
     System.out.println("Digite o valor de a");
     A = sc.nextFloat();
      System.out.println("Digite o valor de b");
     B = sc.nextFloat();
      System.out.println("Digite o valor de c");
     C = sc.nextFloat();
      
      D=(B*B)-4*A*C;
      R1 = (float) (-B + Math.sqrt(D)) / 2 * A;
      R2 = (float) (-B - Math.sqrt(D)) / 2 * A;
      
      if ((A == 0) || (((B*B) -(4*A*C)) < 0)) {
          System.out.println("Impossível calcular");
      }else{
      System.out.println("Primeira raiz: " + R1 + "Segunda raiz: " + R2);
      }  
    }
}
