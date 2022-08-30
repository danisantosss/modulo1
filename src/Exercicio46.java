import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float percurso, gasolinakm, consumo;
        System.out.println("Digite a quilometragem do percurso");
        percurso = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quantidade de gasolina consumida em litros");
        gasolinakm = Float.parseFloat(leitor.nextLine());
        consumo = percurso / gasolinakm;
        if (consumo >= 10 && consumo <= 16){
            System.out.println("Consumo normal");
        } else {
            if(consumo > 16){
                System.out.println("Consumo anormal");
            }
        }
    }
    
}
