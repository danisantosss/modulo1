import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigoprod, codigopais;
        float pesokg, pesog, valortotal;
        float preco = 0;
        float imposto = 0;
        
        System.out.println("Digite o peso em quilogramas");
        pesokg = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o código do produto");
        codigoprod = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o código do país");
        codigopais = Integer.parseInt(leitor.nextLine());
        pesog = pesokg * 1000;

        if(codigoprod >= 1 && codigoprod <=4){
            preco = pesog * 10;
            System.out.println("O preço total do produto comprado é " + preco);
        } else {
            if(codigoprod >= 5 && codigoprod <= 7){
                preco = pesog * 25;
                System.out.println("O preço total do produto comprado é " + preco);
            } else {
                if(codigoprod >= 8 && codigoprod <= 10){
                    preco = pesog * 35;
                    System.out.println("O preço total do produto comprado é " + preco);
                }
            }
        } if(codigopais == 1){
            imposto = preco * 0;
            System.out.println("O valor do imposto é " + imposto);
        } else {
            if(codigopais == 2){
                imposto = (preco * 15) / 100;
                System.out.println("O valor do imposto é " + imposto);
            } else {
                if(codigopais ==3){
                    imposto = (preco * 25) / 100;
                    System.out.println("O valor do imposto é " + imposto);
                }
            }
        } valortotal = preco + imposto;
        System.out.println("O valor total é " + valortotal);


        
    }
    
}
