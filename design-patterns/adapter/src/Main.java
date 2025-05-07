
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor: ");
double valor = scanner.nextDouble();
        
        System.out.print("Informe o percentual de desconto: ");
double percentual = scanner.nextDouble();

CalculadoraDesconto calculadora = new DescontoAdapter();
double valorComDesconto = calculadora.calcular(valor, percentual);

DecimalFormat df = new DecimalFormat("R$#,##0.00");
        System.out.println("Valor com desconto: " + df.format(valorComDesconto));

        scanner.close();
    }
}
