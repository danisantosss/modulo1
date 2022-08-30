import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float bmaior, bmenor, altura, area;

        System.out.println("Digite a base maior");
        bmaior = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a base menor");
        bmenor = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a altura");
        altura = Float.parseFloat(leitor.nextLine());
        
        area = ((bmaior + bmenor) * altura) / 2;

        System.out.println("A área do trapézio é " + area);
        leitor.close();
    }
    
}
