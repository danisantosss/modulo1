import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10];
        int[] lista2Numeros = new int[10];
        int inversao = 9;
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
            lista2Numeros[inversao]= listaNumeros[i];
            inversao = inversao - 1;
            
            }  System.out.println(Arrays.toString(listaNumeros));
            System.out.println(Arrays.toString(lista2Numeros));

        
    }
    
}
