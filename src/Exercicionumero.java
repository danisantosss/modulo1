import java.util.Scanner;

public class Exercicionumero {

    public static void main(String[] args) {
        
        int numeroum, numerodois, numerotres;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        numeroum = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o segundo número");
        numerodois = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o terceiro número");
        numerotres = Integer.parseInt(leitor.nextLine());
            if(numeroum > numerodois && numerodois > numerotres){

            System.out.println("O primeiro número é o maior, o segundo número é o do meio e o terceiro número é o menor");
        }else{
            if(numeroum > numerotres && numerotres > numerodois){
                System.out.println("O primeiro número é o maior, o terceiro número é o do meio e o segundo numero é o menor");
            }
            if(numerodois > numeroum && numeroum > numerotres){
                System.out.println("O segundo número é o maior, o primeiro número é o do meio e o terceiro número é o menor");
            }
            if(numerodois > numerotres && numerotres > numeroum){
                System.out.println("O segundo número é o maior, o terceiro número é o do meio e o primeiro numero é o menor");
            }

            }if(numerotres > numeroum && numeroum > numerodois){
                System.out.println("O terceiro número é o maior, o primeiro número é o do meio e o segundo número é o menor");

            }if(numerotres > numerodois && numerodois > numeroum){
                System.out.println("O terceiro número é o maior, segundo número é o do meio e o primeiro número é o menor");
                leitor.close();
            
        }
    }
    
}
