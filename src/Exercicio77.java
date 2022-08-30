import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {

        int multiplicador;
        int resultado = 0;

        int[] listaNumeros = new int[10];
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
          
    }   System.out.println("Digite um multiplicador");
    multiplicador = Integer.parseInt(leitor.nextLine());
    for(int i = 0; i < listaNumeros.length; i++){
        resultado = listaNumeros[i] * multiplicador;
        System.out.println("O numero " + listaNumeros[i] + " multiplicado é " + resultado);
    } 
    } 
}
