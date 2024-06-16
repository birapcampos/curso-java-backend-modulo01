package manipulandoStrings;

public class ManipulandoStrings {
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println("Nome completo: " + nomeCompleto);

        // Concatenando numeros
        int idade = 30;
        String mensagem = "Idade: " + idade;
        System.out.println(mensagem);

        //Camparando Strings
        String str1 = "hello";
        String str2 = "world";
        if (str1.equals(str2)) {
            System.out.println("As strings são iguais");
        } else {
            System.out.println("As strings são diferentes");
        }

        // Verificação de Substring
        String texto = "Olá, mundo!";
        if (texto.contains("mundo")) {
            System.out.println("A string contém a palavra 'mundo'");
        } else {
            System.out.println("A string não contém a palavra 'mundo'");
        }

        //Divisão de String em Substrings
        String frase = "Esta é uma frase de exemplo";
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        //Remoção de Espaços em Branco
        String textoComEspacos = "   texto com espaços   ";
        String textoSemEspacos = textoComEspacos.trim();
        System.out.println("Texto com espaços: '" + textoComEspacos + "'");
        System.out.println("Texto sem espaços: '" + textoSemEspacos + "'");

        // Transforma palavra em minusculo para maiusculo
        String frase2 = "O Senhor é o meu pastor e nada me faltara.";

        System.out.println("Frase em maiusculo " + frase2.toUpperCase());
        System.out.println("Frase em minusculo " + frase2.toLowerCase());

    }
}
