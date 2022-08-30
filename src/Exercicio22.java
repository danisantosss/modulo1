import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float salario, gratificacao, imposto, total;

        gratificacao = 50f;
        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        imposto = (salario * 10f) / 100f;
        total = (salario - imposto) + gratificacao;
        System.out.println("O salário total é " + total);

        leitor.close();


    }
    
}
