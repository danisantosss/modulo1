import java.util.Scanner;

public class Exercicio39 {
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       float numeroum, numerodois, media;
       System.out.println("Digite o primeiro número");
       numeroum = Float.parseFloat(leitor.nextLine());
       System.out.println("Digite o segundo número");
       numerodois = Float.parseFloat(leitor.nextLine());

       if(numeroum == numerodois){
           System.out.println("Os números são iguais");
           media = (numeroum + numerodois) / 2;
           System.out.println("A média dos dois numeros é " + media);
       } else {
            if(numeroum > numerodois){
                System.out.println("O primeiro número é o maior");
            } else {
                System.out.println("O segundo número é o maior");
            }
        }
   }
    
}
