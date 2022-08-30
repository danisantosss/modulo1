import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float colesterol, percentual;
        System.out.println("Digite a quantidade de colesterol");
        colesterol = Float.parseFloat(leitor.nextLine());
        if(colesterol <= 130){
            System.out.println("O colesterol está ideal");
        } else {
            percentual = (colesterol * 100) / 130 - 100;
            System.out.println("O colesterol está maior com um percentual de " + percentual);
        }
    }
    
}
