import java.util.*;

public class Main {
  
    private static final double raio = 7.5;

    public static void main(String[] args) {
        double perimetro = 2 * Math.PI * raio;

        double area = Math.PI * raio * raio;

        System.out.println("Perimetro = " + perimetro);
        System.out.println("Area = " + area);
    }
}
