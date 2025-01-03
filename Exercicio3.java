import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase para contar os caracteres:");
        String frase = scanner.nextLine();
        
        count(frase);
        
        scanner.close();
    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        
        int letras = 0;
        int espacos = 0;
        int numeros = 0;
        int outros = 0;
        
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letras++; 
            }
            else if (Character.isDigit(ch[i])) {
                numeros++; 
            }
            else if (Character.isSpaceChar(ch[i])) {
                espacos++; 
            }
            else {
                outros++; 
            }
        }
        
        System.out.println("Frase: " + x);
        System.out.println("Letras: " + letras);
        System.out.println("Espaços: " + espacos);
        System.out.println("Números: " + numeros);
        System.out.println("Outros: " + outros);
    }
}
