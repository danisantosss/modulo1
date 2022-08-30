import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float salario, contaum, contadois, multaum, multadois, multatotal;

        System.out.println("Digite o salário");
        salario= Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a primeira conta");
        contaum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda conta");
        contadois = Float.parseFloat(leitor.nextLine());

        multaum = (contaum * 102) / 100;
        multadois = (contadois * 102) / 100;

        multatotal = multaum + multadois;

        System.out.println("O salário restante é " + (salario - multatotal));


        
        leitor.close();

    }
    
}
