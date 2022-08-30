import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float minutos, valor;
        int origem;
        System.out.println("Digite o total de minutos na ligação");
        minutos = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a origem");
        System.out.println("1 para local, 2 para intermunicipal e 3 para interestadual");
        origem = Integer.parseInt(leitor.nextLine());
        if(origem == 1){
            valor = minutos * 0.020f;
            System.out.println("O valor total da ligação é " + valor);
        } else {
            if(origem ==2){
                valor = minutos * 0.08f;
                System.out.println("O valor total da ligação é " + valor);
            } else {
                if(origem ==3){
                valor = minutos * 0.1f;
                System.out.println("O valor total da ligação é " + valor);
                 }
                }
            }

    }
    
}
