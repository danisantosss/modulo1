import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float horatrab, salariomin, horaextratrab, valorhoratrab, valorhoraextratrab, salariobruto, salarioextra, salariototal;
        System.out.println("Digite as horas trabalhadas");
        horatrab = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor do salário mínimo");
        salariomin = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite as horas extras trabalhadas");
        horaextratrab = Float.parseFloat(leitor.nextLine());
        valorhoratrab = salariomin / 8f;
        valorhoraextratrab = salariomin / 4f;
        salariobruto = horatrab * valorhoratrab;
        System.out.println("O salário bruto é " + salariobruto);
        salarioextra = valorhoraextratrab * horaextratrab;
        System.out.println("O salário das horas extras é " + salarioextra);
        salariototal = salarioextra + salariobruto;
        System.out.println("O salário total é " + salariototal);

    }
    
}
