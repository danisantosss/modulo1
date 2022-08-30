import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float salariof, salariom, total;
    

        System.out.println("Digite o salário do funcionário");
        salariof = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o salário mínimo");
        salariom = Float.parseFloat(leitor.nextLine());
        total = salariof / salariom;
        System.out.println("A quantidade de salário que cabe é " + Math.floor(total));

        leitor.close();
    }
    
}
