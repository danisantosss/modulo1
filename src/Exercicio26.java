import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float salario, valorquilowatt, quantquilowatt, totalquilowatt, desconto, total;

        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de quilowatt por residência");
        quantquilowatt = Float.parseFloat(leitor.nextLine());
        valorquilowatt = salario / 5;
        System.out.println("O valor de cada quilowatt é " + valorquilowatt);
        totalquilowatt = quantquilowatt * valorquilowatt;
        System.out.println("O valor total a ser pago pela residência é " + totalquilowatt);
        desconto = (totalquilowatt * 15) / 100;
        total = totalquilowatt - desconto;
        System.out.println("O valor total com desconto é " + total);

        leitor.close();
    }
    
}
