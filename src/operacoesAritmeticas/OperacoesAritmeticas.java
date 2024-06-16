package operacoesAritmeticas;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;
        boolean temPalavra = false;
        double numero = 16;
        double raizQuadrada = Math.sqrt(numero);

        String frase = "Carlos foi para escola esta tarde.";
        String palavra = "escola";

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        if(frase.contains(palavra))
            temPalavra = true;
        else
            temPalavra = false;

        System.out.println("A frase " + (temPalavra ? "contém" : "não contém") + " a palavra: " + palavra);

    }
}
