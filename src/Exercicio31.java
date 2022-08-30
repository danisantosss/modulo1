import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {

        float numero, numeroum, numerodois, soma, resultado;
        int opcao;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("|Digite 1 para soma         |");
        System.out.println("|Digite 2 para raiz quadrada|");
        System.out.println("+---------------------------+");
        opcao = Integer.parseInt(leitor.nextLine());
        if(opcao ==1){

        
        
        System.out.println("Digite o primeiro número");
        numeroum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o segundo número");
        numerodois = Float.parseFloat(leitor.nextLine());
        soma = numeroum + numerodois;
        System.out.println("A soma dos dois números é " + soma);

    }else{
        System.out.println("Digite um número");
        numero = Float.parseFloat(leitor.nextLine());
        resultado = (float)Math.sqrt(numero);
        System.out.println("A raiz quadrada desse número é " + resultado);
        leitor.close();



    }
    }
    
}
