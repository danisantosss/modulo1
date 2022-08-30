import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        
        float celso, fahrenheit;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius");
        celso = Float.parseFloat(leitor.nextLine());
        fahrenheit = celso * 1.8f + 32f;
        System.out.println("A temperatura em fahrenhait é " + fahrenheit);


        leitor.close();

        

    }
    
}
