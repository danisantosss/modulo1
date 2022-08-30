import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        float salario, valorvendas, comissao, valortotal;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor total de vendas");
        valorvendas = Float.parseFloat(leitor.nextLine());
        comissao = (4f * valorvendas) / 100f;
        System.out.println("A comissão é " + comissao);
        valortotal = comissao + salario;
        System.out.println("O valor total é " + valortotal);
        leitor.close();
    }
    
}
