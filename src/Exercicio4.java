import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float numero, valor;

        System.out.println("Digite o número de fotos reveladas");
        numero = Float.parseFloat(leitor.nextLine());

        valor = numero * 0.9f;
        System.out.println("O valor total das fotos reveladas é R$" + valor);

        leitor.close();


    }
    
}
