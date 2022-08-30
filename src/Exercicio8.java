import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        float numero;
        int numinteiro;
        float numdecimal;
        int numarredondado;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = Float.parseFloat(leitor.nextLine());
        //conversão de tipo float para int (com perda de informação)
        numinteiro = (int)numero;
        numarredondado = Math.round(numero);
        numdecimal = numero % 1; //numero - numinteiro
        
        
        System.out.println("A parte inteira é " + numinteiro);
        System.out.println("A parte fracionária (decimal) é " + numdecimal);
        System.out.println("O arredondamento é " + numarredondado);

        
        leitor.close();

    
    }
    
}
