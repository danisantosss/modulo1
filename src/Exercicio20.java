import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        float horas, minutos, horamin, totalmin, totalseg;

        System.out.println("Digite as horas");
        horas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite os minutos");
        minutos = Float.parseFloat(leitor.nextLine());
        horamin = horas * 60;
        System.out.println("A hora convertida em minuto é " + horamin);
        totalmin = minutos + horamin;
        System.out.println("O total dos minutos é " + totalmin);
        totalseg = totalmin * 60;
        System.out.println("O total dos segundos é " + totalseg);
        leitor.close();
    }
    
}
