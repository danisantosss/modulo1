import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        int contador = 0;
        float media = 0;
        int omaiornumero=0;
        int omenornumero=0;
        int somapar=0;
        int contapar=0;
        int mediapares=0;

        do{
            
            System.out.println("Digite um numero");
            numero = Integer.parseInt(leitor.nextLine());
            
            if(numero != 30000){
                soma = soma + numero;

                if(contador==0){
                    omaiornumero = numero;
                }else{
                    if(numero > omaiornumero){
                        omaiornumero = numero;
                    }
                }
                //nunca deve misturar a lógica do maior numero com a do menor numero
                if(contador==0){
                    omenornumero = numero;
                }else{
                    if(numero < omenornumero){
                        omenornumero = numero;
                    }
                }
                if(numero % 2 == 0){
                    somapar += numero; //somapar = somapar + numero;
                    contapar++;
                }
                contador++; // contador = contador + 1; // contador += 1;  
            }
        }while(numero != 30000);

        media = soma / contador;
        System.out.println("A soma é " + soma);
        System.out.println("A qtd total de numeros é " + contador);
        System.out.println("A media é " + media);
        System.out.println("O maior numero é " + omaiornumero);
        System.out.println("O menor numero é " + omenornumero);
        mediapares = somapar / contapar;
        System.out.println("A media dos numeros pares e " + mediapares);
        int numimpar = contador - contapar;
        /*
           numeroTOTAL      100
           numimpar         perc
        */
        float percimpar = (numimpar * 100f) / contador;
        System.out.println("O percentual de numeros impar e " + percimpar);

        
        

        
    }
}
