package entradaDadosScanner;

import java.util.Locale;
import java.util.Scanner;
public class DadosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Definindo o separador decimal como ponto
        scanner.useLocale(Locale.US);

        // Definindo o separador decimal como vírgula para o Brasil
        //scanner.useLocale(new Locale("pt", "BR"));


        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        System.out.println("Você digitou: " + numeroInteiro);

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("Você digitou: " + numeroDecimal);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Olá, " + nome + "!");

        scanner.close();
    }
}
