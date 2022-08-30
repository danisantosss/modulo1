import java.util.Scanner;

public class Exercicio75 {
    public static void main(String[] args) {

        int soma = 0;
        float media = 0;

        int[] listaNumeros = new int[10];
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite um número");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
            soma = soma + listaNumeros[i];
            
        } media = soma / 10f;
        System.out.println("A soma dos números é " + soma);
        System.out.println("A media dos numeros é " + media);
    }
    
}
