import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        float media;
        
        
        for(int i = 0; i<10; i++){
            System.out.println("Digite um número");
            numero = Integer.parseInt(leitor.nextLine());
            soma += numero;         
            
         }
          media = soma / 10;  
        System.out.println("a soma dos numeros é " + soma);
        System.out.println("a media dos numeros é " + media);
    }
    
}
