import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        int pessoas, carne;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o total de pessoas convidadas");
        pessoas = Integer.parseInt(leitor.nextLine());

        carne = pessoas * 250;
        System.out.println("O total de gramas de carne necessária é " + carne);

        leitor.close();
        
    }
    
}
