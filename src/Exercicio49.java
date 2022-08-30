import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String curso;
        float mensalidade;
        float bolsa;
        System.out.println("Digite o seu curso");
        curso = leitor.nextLine();
        System.out.println("Digite o valor da mensalidade");
        mensalidade = Float.parseFloat(leitor.nextLine());
        if(curso.equals("ingles") || curso.equals("espanhol")){
            bolsa = mensalidade * 40 / 100;
            if(bolsa > 200f){
                bolsa = 200f;
            }
        } else {
            bolsa = mensalidade * 55 / 100;
            if(bolsa > 300f){
                bolsa = 300f;
            }
        } System.out.println("O valor da bolsa é " + bolsa);
    }
    
}
