package casting;

public class Casting {
    public static void main(String[] args) {
        // Conversão implícita de int para double
        int a = 10;
        double b = a;
        System.out.println(b);

        // Conversão explícita de double para int
        double c = 10.5;
        int d = (int) c;
        System.out.println(d);
    }
}
