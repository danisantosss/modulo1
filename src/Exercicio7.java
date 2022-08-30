import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float percentual, boleto, multa;
        System.out.println("Digite o valor do boleto");
        boleto = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual da multa");
        percentual = Float.parseFloat(leitor.nextLine());
        multa = (boleto * percentual) / 100;
        System.out.println("O valor da multa é " + multa);
        leitor.close();
    }
    
}
