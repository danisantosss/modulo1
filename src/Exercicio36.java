import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float pesoracaokg, pesoracaog, quantracaoum, quantracaodois, quantracaototal, restcincodias;

        System.out.println("Digite o peso da ração em quilos");
        pesoracaokg = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de ração para o primeiro gato");
        quantracaoum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade ração para o segundo gato");
        quantracaodois = Float.parseFloat(leitor.nextLine());
        pesoracaog = pesoracaokg * 1000;
        quantracaototal = (quantracaoum + quantracaodois) * 5;
        restcincodias = pesoracaog - quantracaototal;
        System.out.println("O total de ração restante após 5 dias é " + restcincodias);
    }
    
}
