import java.util.Scanner;

public class Exercicio54 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float produtodolar, valordolar, produtoreais, transportereais, tipoimposto, impostofederal, impostoestadual, precototal;
        System.out.println("Digite o preço original do produto em dólares");
        produtodolar = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o valor da cotação do dólar");
        valordolar = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o preço do transporte em reais");
        transportereais = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o tipo de imposto");
        System.out.println("(1 - IPI, 2 - ICMS, 3 - Ambos IPI e ICMS)");
        tipoimposto = Float.parseFloat(leitor.nextLine());
        produtoreais = produtodolar * valordolar;
        System.out.println("O valor do produto em reais é " + produtoreais);

        if(tipoimposto == 1 && produtoreais <= 3000){
            impostofederal = (produtoreais * 1.5f) / 100;
            System.out.println("O valor do imposto federal é " + impostofederal);
        } else {
            if(tipoimposto == 1 && produtoreais > 3000){
                impostofederal = (produtoreais * 2) / 100;
                System.out.println("O valor do imposto federal é " + impostofederal);
            } else {
                if(tipoimposto == 2 && produtoreais < 1500){
                    impostofederal = (produtoreais * 2) / 100;
                    System.out.println("O valor do imposto federal é " + impostofederal);
                } else {
                    if(tipoimposto == 2 && produtoreais >= 1500){
                        impostofederal = (produtoreais * 3.5f) / 100;
                        System.out.println("O valor do imposto federal é " + impostofederal);
                    } else {
                        impostofederal = (produtoreais * 5) / 100;
                        System.out.println("O valor do imposto federal é " + impostofederal);
                    }
                }
            }
        }   impostoestadual = impostofederal * (2f/7f);
            System.out.println("O valor do imposto estadual é " + impostoestadual);

            precototal = produtoreais + transportereais + impostoestadual + impostofederal;
            System.out.println("O preço total é " + precototal);

    }
    
}
