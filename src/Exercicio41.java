import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        float numpaginas, dias, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de páginas do livro");
        numpaginas = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite quantos dias tem para ler o livro");
        dias = Float.parseFloat(leitor.nextLine());
        media = numpaginas / dias;
        if(media > 100){
            System.out.println("Impossível de realizar a leitura");
        } else {
            System.out.println("O número de páginas por dia para ler é de " + media);

        }
    }
    
}
