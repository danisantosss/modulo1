import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float distancia;

        System.out.println("Digite quantos km foram rodados");
        distancia = Float.parseFloat(leitor.nextLine());
        System.out.println("O valor de reembolso de despesas de combustível é R$" + ((distancia / 13) * 2.20f));

        leitor.close();

    }
    
}
