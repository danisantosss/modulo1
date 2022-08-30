import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros = 0;
        int soma = 0;
        System.out.println("Digite uma faixa de valores");
        numeros = Integer.parseInt(leitor.nextLine());
        for(int i = 0; i <= numeros; i++){
            if(i % 2 == 1){
                soma = soma + i;
            }
        } System.out.println("A soma de todos os numeros ímpares são " + soma);
    }
    
}
