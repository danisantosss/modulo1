import java.util.Arrays;
import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        int pecasvendidas[] = new int [10];
        float pecaspreco[] = new float [10];
        float totalvenda;
        for(int i = 0; i<10; i++){
            System.out.println("Digite o total de peças vendidas");
            pecasvendidas[i] = Integer.parseInt(leitor.nextLine());
        } for(int i = 0; i<10; i++){
            System.out.println("Digite o valor das peças");
            pecaspreco[i] = Float.parseFloat(leitor.nextLine());
        } System.out.println(Arrays.toString(pecasvendidas));
        for(int i = 0; i<10; i++){
            totalvenda = pecaspreco[i] * pecasvendidas[i];
            System.out.println("O vendedor " + i + " obteve o valor de " + totalvenda);
        }   
    }
    
}
