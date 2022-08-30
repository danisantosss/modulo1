import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float dimensaoum, dimensaodois, area, potencia;

        System.out.println("Digite a primeira dimensão");
        dimensaoum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda dimensão");
        dimensaodois = Float.parseFloat(leitor.nextLine());
        area = dimensaoum * dimensaodois;
        potencia = area * 18;
        System.out.println("A área do cômodo é " + area);
        System.out.println("A potência de iluminação utilizada é " + potencia);
        leitor.close();
    }
    
}
