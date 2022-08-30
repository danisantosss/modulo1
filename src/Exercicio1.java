import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        
        int horas, dias, totalhoras;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas por dia");
        horas = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite os dias trabalhados por mês");
        dias = Integer.parseInt(leitor.nextLine());

        totalhoras = dias * horas;

        System.out.println("O total de horas trabalhadas em um mês é " + totalhoras);

        leitor.close();

        
        
        

    }


    
}
