import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas notas voce quer inserir? ");
        int numNotas = scanner.nextInt();
        
        double somaNotas = 0;
        
        for (int i = 1; i <= numNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota; 
        }
        
        double media = somaNotas / numNotas;
        
        System.out.println("A media das notas: " + media);
        
        if (media >= 7) {
            System.out.println("O aluno esta aprovado!");
        } else if (media >= 5) {
            System.out.println("O aluno esta em recuperacao.");
        } else {
            System.out.println("O aluno esta reprovado.");
        }
        
        scanner.close();
    }
}
