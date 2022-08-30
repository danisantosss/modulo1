import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float dmaior, dmenor, area;

        System.out.println("Digite a diagonal maior");
        dmaior = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a diagonal menor");
        dmenor = Float.parseFloat(leitor.nextLine());
        area = (dmaior * dmenor) / 2;
        System.out.println("A área do losango é " + area);
        leitor.close();
    }
    
}
