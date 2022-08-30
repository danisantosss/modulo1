import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float rendimentoanual, imposto;
        System.out.println("Digite o rendimento anual");
        rendimentoanual = Float.parseFloat(leitor.nextLine());
        if(rendimentoanual <= 19200){
            System.out.println("Isento de imposto");
        } else {
            if(rendimentoanual > 19200 && rendimentoanual <= 30000){
                imposto = (rendimentoanual * 8) / 100;
                System.out.println("O valor do imposto de renda é " + imposto);
            } else {
                imposto = (rendimentoanual * 11) / 100;
                System.out.println("O valor do imposto de renda é " + imposto);
            }
        }
    }
    
}
