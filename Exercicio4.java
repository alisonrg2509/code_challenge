import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificacao: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificacao: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificacao: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificacao: Obesidade grau 1");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificacao: Obesidade grau 2");
        } else {
            System.out.println("Classificacao: Obesidade grau 3");
        }

        scanner.close();
    }
}
