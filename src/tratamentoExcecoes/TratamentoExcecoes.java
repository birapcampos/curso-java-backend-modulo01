package tratamentoExcecoes;
public class TratamentoExcecoes {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir por zero!");
        }
    }
}
