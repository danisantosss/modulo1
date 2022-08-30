public class Exercicio56 {
    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;
        while(contador <= 500){
            contador++;
            int resto = contador % 2;
            if(resto == 0){
                System.out.print(contador + " ");
                soma = soma + contador;
               }
            
        }
        System.out.println("A soma dos numeros pares é " + soma);
    }
    
}
