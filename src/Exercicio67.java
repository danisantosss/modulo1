import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int tabuada = 1;
        System.out.println("Digite um número");
        numero = Integer.parseInt(leitor.nextLine());
        for(int i = 1; i <= 10; i++){
            tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }
    
}
