import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float horas, valorhoras, salariomin, salariobruto, imposto, total;

        System.out.println("Digite as horas");
        horas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o salário");
        salariomin = Float.parseFloat(leitor.nextLine());

        valorhoras = salariomin / 2;
        salariobruto = horas * valorhoras;
        imposto = (salariobruto * 3) / 100;
        total = salariobruto - imposto;
        System.out.println("O salário total é " + total);
        leitor.close();
    }
    
}
