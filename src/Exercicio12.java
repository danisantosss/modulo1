import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        float pesokg, pesog;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o peso em quilos");
        pesokg = Float.parseFloat(leitor.nextLine());
        pesog = pesokg * 1000;
        System.out.println("O peso em gramas é " + pesog);
        leitor.close();
    }
    
}
