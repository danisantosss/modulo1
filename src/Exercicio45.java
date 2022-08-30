import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float preco, taxa, total;
        int itens;
        System.out.println("Digite o total de itens comprados");
        itens = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o preço da compra");
        preco = Float.parseFloat(leitor.nextLine());
        taxa = itens * 1.5f;
        if(preco <= 100){
            total = (preco * 95 / 100) + taxa;
            System.out.println("O valor com desconto é " + total);
        } else {
            if(preco > 100 && preco <= 400){
                total = (preco * 90 / 100) + taxa;
                System.out.println("O valor com desconto é " + total);
            } else {
                if(preco > 400){
                total = (preco * 87 / 100) + taxa;
            System.out.println("O valor com desconto é " + total);
            
                }
            }
        }

    }
    
    
}
