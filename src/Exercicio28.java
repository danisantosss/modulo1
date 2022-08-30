import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {

        int numero;
        Scanner leitor = new Scanner(System.in);
        //System.in = receba dados do buffer do teclado
        System.out.println("Digite sua idade");
        numero = Integer.parseInt(leitor.nextLine());

        if(numero >=18){
            System.out.println("Você é de maior");
        }else{
            System.out.println("Você é de menor");
            leitor.close();
        }
        
    }
    
}
