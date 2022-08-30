import java.util.Scanner;


public class Entradas {
    //dentro dessa parada
    public static void main(String[] args) {
        System.out.println("Querido usuario, digite seu nome?");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        System.out.println(nome);
        
        leitor.close();
        
        
        
    }
}
