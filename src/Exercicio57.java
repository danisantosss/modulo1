import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = 0;
        float e = 1;
        
        
        

        System.out.println("Digite o valor de N");
        n = Integer.parseInt(leitor.nextLine());

        for(int j =1; j <= n; j++){
        int numfat = j;
        int resfat = 1;

        for(int i=numfat; i>=1; i--){
            resfat = resfat * i;
            
        } 
        e = e + (1f / resfat);
        System.out.println("O fatorial de " + numfat + " = " + resfat);
        } System.out.println("O resultado é " + e);
    }
    
}
