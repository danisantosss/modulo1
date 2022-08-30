import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {

        float salario, novosalario;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o salário");
        salario = Float.parseFloat(leitor.nextLine());
        if(salario <=500){

            novosalario = (salario * 130) / 100;
            System.out.println("O novo salário é " + novosalario);
        }else{
            System.out.println("Você não tem direito ao aumento");
            leitor.close();
        }
    }
}
