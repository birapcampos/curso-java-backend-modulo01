package metodos;

public class ExemploMetodos {

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        // Chamando o método definido na classe Exemplo
        exemplo.meuMetodo();
    }

    static class Exemplo {
        public void meuMetodo() {

            System.out.println("Este é o meu método!");
        }
    }
}
