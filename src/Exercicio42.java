import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float velocidade;
        System.out.println("Digite a velocidade de seu carro");
        velocidade = Float.parseFloat(leitor.nextLine());
        if(velocidade > 60 && velocidade <= 100){
            System.out.println("Multa média 60 UFIR");
        } else {
            if(velocidade > 100 && velocidade <= 160){
                System.out.println("Multa grave 120 UFIR");
            } else {
                if(velocidade > 160){
                    System.out.println("Multa gravíssima 180 UFIR");
                }
            }
        }
    }
    
}
