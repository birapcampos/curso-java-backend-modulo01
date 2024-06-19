package usandoArrays;

public class TrabalhandoComArrays {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros
        int[] numeros = new int[5];

        // Inicializando valores no array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Outra forma de inicializar
        int[] outrosNumeros = { 1, 2, 3, 4, 5 };

        // Exibindo todos os elementos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

        // Declaração de um array 2D
        int[][] matriz = new int[2][3];

        // Inicialização de um array 2D
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        matriz[1][0]=4;
        matriz[1][1]=5;
        matriz[1][2]=6;

        System.out.println();

        // Acessando elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento na posição [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }

    }
}
