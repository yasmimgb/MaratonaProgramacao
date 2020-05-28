import java.util.Scanner;

public class MyClass {
    
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int qtdHoras = input.nextInt();
    int velocidadeMediaHora = input.nextInt();
    
    int qtdQuilometros = qtdHoras * velocidadeMediaHora;
    
    double qtdLitrosGastos = qtdQuilometros / 12.0;
    
    System.out.printf("%.3f%n", qtdLitrosGastos );
    
    input.close();
    
    }
}
