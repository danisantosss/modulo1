import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        
        float preco, precototal;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o preço");
        preco = Float.parseFloat(leitor.nextLine());
        precototal = preco - (preco / 10);
        System.out.println("O preço com desconto é " + precototal);

        leitor.close();
    }
    
}
