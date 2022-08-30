import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        int n;
        int outronumero = 0;
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de N");
        n = Integer.parseInt(leitor.nextLine());
        
        
        for(int i = 1; i <= n; i++ ){
            System.out.println("Digite outro número");
            outronumero = Integer.parseInt(leitor.nextLine());
            int resfat = 1;
            for (int j=outronumero; j >= 1; j--){
                resfat = resfat * j;
                
            }
            
            System.out.println(String.format("%d! = %d", outronumero,resfat));
        }
    
            

            
        
    }
}
