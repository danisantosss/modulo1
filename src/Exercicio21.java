import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float salario, porcentagem, aumento, total;

        System.out.println("Digite o valor do salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da porcentagem");
        porcentagem = Float.parseFloat(leitor.nextLine());
        aumento = (porcentagem / 100) * salario;
        System.out.println("O valor do aumento é R$" + aumento);
        total = aumento + salario;
        System.out.println("O valor total do salário é R$" + total); 
        leitor.close();
    }
    
}
