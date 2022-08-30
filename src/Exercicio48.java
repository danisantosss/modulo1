import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float aluguel;
        float condominiovalor;
        float valorgas;
        float valoragua;
        float metrogas;
        float metroagua;
        float desconto = 0;
        float total;
        System.out.println("Digite o valor do aluguel");
        aluguel = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do condomínio");
        condominiovalor = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o total de metro cubico do gas");
        metrogas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o total de metro cubico da agua");
        metroagua = Float.parseFloat(leitor.nextLine());
        valorgas = metrogas * 1.8f;
        valoragua = metroagua * 0.6f;
        
         total = aluguel + condominiovalor + valorgas + valoragua - desconto;
         desconto = total * 5 / 100;
         System.out.println("O total de desconto se pago 5 dias antes do vencimento é " + desconto);
        
        
    }
    
}
