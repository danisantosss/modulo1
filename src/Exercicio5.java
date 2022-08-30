import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        float salario, despesa, porcentagem;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a despesa mensal");
        despesa = Float.parseFloat(leitor.nextLine());

        porcentagem = (despesa*100) / salario;
        System.out.println("O percentual da despesa mensal é %" + porcentagem);
        
        leitor.close();
    }

    
}
