//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Interpretador de texto simples (digite 'sair' para encerrar)");
        System.out.println("Comandos disponíveis: caixa_alta(\"texto\") e repetir(n, \"texto\")");

        while (true) {
            System.out.print("\nDigite um comando: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Expressao expressao = Parser.parse(entrada);
                String resultado = expressao.interpretar();
                System.out.println("Resultado: " + resultado);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
