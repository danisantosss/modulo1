import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salario, gratificacao, imposto, salariototal;
        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        gratificacao = (salario * 5) / 100;
        imposto = (salario * 7) / 100;
        salariototal = salario + gratificacao - imposto;
        System.out.println("O salário total é " + salariototal);



    }
    
}
