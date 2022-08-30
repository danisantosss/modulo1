import java.util.Scanner;

public class Exercicio38 {

    public static void main(String[] args) {
        float preco = 0;
        int codorigem = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço do produto");
        preco = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o codigo da origem");
        codorigem = Integer.parseInt(leitor.nextLine());

        if(codorigem == 1){
            System.out.println("Origem SUL");
        }else{
            if(codorigem == 2){
                System.out.println("Origem NORTE");
            }else{
                if(codorigem == 3){
                    System.out.println("Origem LESTE");
                }else{
                    if(codorigem == 4){
                        System.out.println("Origem OESTE");
                    }else{
                        if(codorigem >= 5 && codorigem <= 6){
                            System.out.println("Origem NOROESTE");
                        }else{
                            if(codorigem >= 7 && codorigem <= 9){
                                System.out.println("Origem SUDESTE");
                            }else{
                                if(codorigem >= 10 && codorigem <= 20){
                                    System.out.println("Origem CENTRO-OESTE");
                                }else{
                                    if(codorigem >= 21 && codorigem <= 30){
                                        System.out.println("Origem NORDESTE");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
