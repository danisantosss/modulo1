import java.util.Scanner;

public class ExemploDecisao {

    public static void main(String[] args) {
        int numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = Integer.parseInt(leitor.nextLine());

        /*if (condição/teste){}
             bloco de codigo (ENTAO - verdadeiro)
    }else{
            bloco de codigo (SENAO - falso)


        */
        if(numero >=10){
            System.out.println("O numero é maior que DEZ");
        }else{
            System.out.println("O numero é menor que DEZ");
        }
    }
    
}
