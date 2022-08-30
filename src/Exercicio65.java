import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        int numero = 0;
        int fatorial = 1;
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("Digite um número positivo");
            numero = Integer.parseInt(leitor.nextLine());
            if(numero <= 0){
                System.out.println("Número inválido");
            } else {
                if(numero == 0){
                    fatorial = 1;
                }
            }
       
        
        
    } while(numero <= 0);

    for(int i = numero; i > 0; i-- ){
        fatorial = fatorial * i;
    }
    System.out.println(String.format("%d!=%d",numero,fatorial));

        }
       
    

} 
    

