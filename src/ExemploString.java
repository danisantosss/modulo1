import java.util.Arrays;

public class ExemploString {
    public static void main(String[] args) {
        String texto = "Universidade da região de Joinville";
        char [] textoarray = texto.toCharArray();
        System.out.println(textoarray);
        System.out.println(Arrays.toString(textoarray));
        //retorna um caracter na posiçao informada
        System.out.println(texto.charAt(0));
        // troca um ou mais caracteres por outros caracteres
        //STRINGS SAO OBJETOS IMUTAVEIS
       // System.out.println(texto.replace(" ", "#")); 
       texto = texto.replace(" ", ","); //.replace("a", "4").replace("e", "3");
        System.out.println(texto);
        //corta o texto
        System.out.println(texto.substring(26,35));
        //conta quantas caractere o texto tem
        System.out.println(texto.length());
        System.out.println(Arrays.toString(texto.split(",")));

        String outroTexto = " \" no meio \" ";
        System.out.println(outroTexto);
    }
    
}
