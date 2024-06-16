package usandoArrays;

public class TrabalhandoComArrays {
    public static void main(String[] args) {
        // Criando um array de numeros inteiros

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Segundo elemento: " + numeros[1]);

        // Criando um array de string
        String[] nomes = {"Alice", "Bob", "Charlie"};

        // Acessando e mostrando um elemento do array
        int indice = 1;
        System.out.println("Elemento no índice " + indice + ": " + nomes[indice]);

        // Mostrando todos os elementos do array
        for(int x=0; x < nomes.length;x++){
            System.out.println(nomes[x]);
        }
    }
}
