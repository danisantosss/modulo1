import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        
        int numero;
        

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = Integer.parseInt(leitor.nextLine());
        int resto = numero % 2;
        if(resto ==1){
            //if(resto % 2 == 1)
            //o simbolo % calcula o RESTO da divisão de dois numeros
            System.out.println("O número é impar");
        }else{
            System.out.println("O número é par");
            leitor.close();
        }
        


    }
    
}
