import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        int[] listaNumeros = new int[10];
        int contadorpar = 0;
        int contadorimpar = 0;
        

        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i < listaNumeros.length; i++){
            System.out.println("Digite um número");
            listaNumeros[i] = Integer.parseInt(leitor.nextLine());
            
            } for(int i = 0; i < listaNumeros.length; i++){
                
                if(listaNumeros[i] % 2 == 0){
                    contadorpar++;                    
                } else {
                    contadorimpar++;
                }
                
            } System.out.println("O total de numeros pares é " + contadorpar);
            System.out.println("O total de numeros impares é " + contadorimpar);
              
        }
}
