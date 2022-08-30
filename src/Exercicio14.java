import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float lado, area;

        System.out.println("Digite a medida do lado");
        lado = Float.parseFloat(leitor.nextLine());
        area = lado * lado;
        System.out.println("A área do quadrado é " + area);

        leitor.close();


    }
    
}
