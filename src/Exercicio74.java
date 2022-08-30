import java.util.Arrays;
import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10];
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        } for(int i = 0; i < listaNumeros.length; i++){
            if(listaNumeros[i] < 10){
                listaNumeros[i] = 0;
            } 
        } System.out.println(Arrays.toString(listaNumeros));
       
    }
    
}
