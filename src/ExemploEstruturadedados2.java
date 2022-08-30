import java.util.Scanner;

public class ExemploEstruturadedados2 {
    public static void main(String[] args) {
        int[] numero = new int [10];
        int[] numero2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numero2[5]);

        char[] nome = {'u','n','i','v','i','l','l','e'};
        //for each
        for(char umaLetra : nome){
            System.out.println(umaLetra);
        }

            String nome2 = "univille";
            System.out.println(nome2.hashCode());
            System.out.println(nome2);
            System.out.println(nome2.toUpperCase());
            nome2 = "UNIVILLE"; //STRING POOL
            System.out.println(nome2.hashCode());
            System.out.println(nome2);

            Scanner leitor = new Scanner(System.in);
            System.out.println("digite UNIVILLE");
            String entrada = leitor.nextLine();

            if(nome2.equalsIgnoreCase(entrada)){
                System.out.println("são iguais");
            } else {
                System.out.println("Não sao iguais");
            }
        
    }
    
}
