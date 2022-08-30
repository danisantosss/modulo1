import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int refeicaodia, quantrefeicao, refeicaomes, refeicaodiatotal;

        System.out.println("Digite a quantidade consumida por refeição");
        quantrefeicao = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de refeição por dia");
        refeicaodia = Integer.parseInt(leitor.nextLine());

        refeicaodiatotal = quantrefeicao * refeicaodia;

        refeicaomes = refeicaodiatotal * 30;
        System.out.println("O total de ração consumida em um mês é " + refeicaomes);
        
        leitor.close();

    }
    
}
