import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float vendamedia, precoatual, precoreajustado;
        System.out.println("Digite o valor da venda média mensal");  
        vendamedia = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o preço atual");
        precoatual = Float.parseFloat(leitor.nextLine());
        if(vendamedia < 500 || precoatual < 30){
            precoreajustado = (precoatual * 112) / 100;
            System.out.println("O preço reajustado é " + precoreajustado);
        } else {
            if((vendamedia >= 500 && vendamedia < 1600) || (precoatual >= 30 && precoatual <80)){
                precoreajustado = (precoatual * 115) / 100;
                System.out.println("O preço reajustado é " + precoreajustado);
            } else { 
                precoreajustado = (precoatual * 75) / 100;
                System.out.println("O preço reajustado é " + precoreajustado);
                }
            }
    }
    
}
