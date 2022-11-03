import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ola, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        scanner.close();
        
        System.err.println("Ola, me chamo "+nome+" "+sobrenome);
        System.err.println("Tenho "+idade+" anos ");
        System.err.println("Minha altura é "+altura+"cm ");
    
    }
}
