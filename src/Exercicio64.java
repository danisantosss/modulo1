import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int segundonumero = 0;
        int soma = 0;
            System.out.println("Digite o primeiro numero");
            numero = Integer.parseInt(leitor.nextLine());
            System.out.println("Digite o segundo numero");
            segundonumero = Integer.parseInt(leitor.nextLine());
            for(int i = 0; i < segundonumero; i++){
                soma = soma + numero;
            }
            

            System.out.println(String.format("%d x %d = %d",numero,segundonumero,soma));
    }
}
