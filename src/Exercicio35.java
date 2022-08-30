import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float precoveiculo, percentlucro, percentimposto;
        float valorlucro, valorimposto, valortotal;
        System.out.println("Digite o preço do veículo");
        precoveiculo = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual do lucro");
        percentlucro = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o percentual do imposto");
        percentimposto = Float.parseFloat(leitor.nextLine());
        valorlucro = (precoveiculo * percentlucro) / 100;
        System.out.println("O valor do lucro é " + valorlucro);
        valorimposto = (precoveiculo * percentimposto) / 100;
        System.out.println("O valor do imposto é " + valorimposto);
        valortotal = precoveiculo + valorlucro - valorimposto;
        System.out.println("O valor total é " + valortotal);
    }
    
}
