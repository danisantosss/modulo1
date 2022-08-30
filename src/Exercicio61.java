import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int soma = 0;
        float media;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("Digite um numero inteiro e positivo");
            numero = Integer.parseInt(leitor.nextLine());
            if(numero < 0) break;
            
            soma += numero;
            contador ++;
            

        }while(numero >= 0);
                
        media = soma / contador;
        System.out.println("A soma dos números é " + soma);
        System.out.println("A media é " + media);
        System.out.println("O total de valores lidos é " + contador);
        
            
    }
    
    
}
