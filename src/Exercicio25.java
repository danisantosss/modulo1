import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float salario, chequeum, chequedois, cpmfum, cpmfdois, cpmftotal, saldo;

        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do primeiro cheque");
        chequeum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do segundo cheque");
        chequedois = Float.parseFloat(leitor.nextLine());
        cpmfum = (chequeum * 0.38f) / 100;
        cpmfdois = (chequedois * 0.38f) / 100;
        cpmftotal = cpmfum + cpmfdois + chequedois + chequeum;
        saldo = salario - cpmftotal;
        System.out.println("O saldo atual é " + saldo);

        leitor.close();
        }
    
}
