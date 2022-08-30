import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float reais, dolar, marco, libra;

        System.out.println("Digite o total de dinheiro em reais");
        reais = Float.parseFloat(leitor.nextLine());
        dolar = reais * 1.8f;
        marco = reais * 2.0f;
        libra = reais * 1.57f;
        System.out.println("O valor convertido em dólar é $" + dolar);
        System.out.println("O valor convertido em marco alemão é $" + marco);
        System.out.println("O valor convertido em libra esterlina é $" + libra);
        leitor.close();
    }
    
}
