import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        
        int[] listaNumeros= new int[10];
        int maiornumero = 0;
        int menornumero = 0;

        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite um numero");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
        }
            for(int i = 0; i < 10; i++){
                if(i==0){
                    maiornumero = listaNumeros[i];
                } else {
                    if (listaNumeros[i] > maiornumero){
                        maiornumero = listaNumeros[i];
                    }
                }
                //nunca vincule a lógica do menor com o maior
                if(i==0){
                    menornumero = listaNumeros[i];
                    } else {
                        if(listaNumeros[i] < menornumero){
                            menornumero = listaNumeros[i];
                        }
                    }
        }  System.out.println("O maior numero é " + maiornumero);
        System.out.println("O menor numero é " + menornumero);
    }
    
}
