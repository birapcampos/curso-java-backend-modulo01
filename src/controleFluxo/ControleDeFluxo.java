package controleFluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
        // if-else
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Não pode votar!");
        }

        String[] frutas = {"Banana", "Maça", "Pera","Uva","Morango"};

        // for
        for(int x=0; x < frutas.length;x++){
            System.out.println(frutas[x]);
        }

    }
}
