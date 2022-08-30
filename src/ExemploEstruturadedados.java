import java.util.Arrays;
import java.util.Scanner;

public class ExemploEstruturadedados {
    public static void main(String[] args) {
        //Variaveis com dados simples
        int idade = 10;
        float salario = 1200;
        boolean VaiChover = true;

        //Variaveis estruturadas -Array/vetor/lista
        String[] listaNomes = new String[10];
        listaNomes[0] = "zezinho";
        listaNomes[9] = "maria ):";

        System.out.println(listaNomes[0]);
       // listaNomes[0] = null;
       // System.out.println(listaNomes[0]);
        System.out.println(listaNomes[1]);

        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i<listaNomes.length; i++){
            System.out.println("Digite um nome");
            listaNomes[i] = leitor.nextLine();
        }

        for(int i=0; i<10; i++){
        System.out.println(listaNomes[i]);

        }
        System.out.println(Arrays.toString(listaNomes));
    }
}
