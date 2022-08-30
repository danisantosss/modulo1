public class Par_ou_impar {

    public static void main(String[] args) {
        int numero = 10;
        int resultado = numero / 2;
        int resto = numero % 2;

        System.out.println("Resultado: " + resultado);
        System.out.println("Resto: " + resto);
        //Operador ternário <condição>?<verdadeiro>:<falso>
        System.out.println(resto ==0?"PAR":"IMPAR");
        
    }
    
}
