import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        int livros;
        float prateleiras;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de livros");
        livros = Integer.parseInt(leitor.nextLine());
        prateleiras = livros / 32f;
        System.out.println("O total de prateleiras necessárias é " + (Math.ceil(prateleiras)));
    }
    
}
