import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int turmas;
        int alunos = 0;
        float media = 0;
        float somanotasturmas = 0;
        float mediaescola = 0;
        
        System.out.println("Digite o número de turmas");
        turmas = Integer.parseInt(leitor.nextLine());
        for(int contaturma = 0; contaturma < turmas; contaturma ++){
            System.out.println("TURMA NUMERO: " + (contaturma + 1));
            System.out.println("Digite o número de alunos");
            alunos = Integer.parseInt(leitor.nextLine());
            float somanotas = 0;
            for(int contaaluno = 0; contaaluno < alunos; contaaluno++){
            System.out.println("ALUNO NUMERO: " + (contaaluno + 1));
            System.out.println("Digite a sua média");
            media = Float.parseFloat(leitor.nextLine());
            somanotas += media;
            }
            float mediaturma = somanotas / alunos;
            somanotasturmas += mediaturma;
    
            System.out.println("A média geral das turmas é " + mediaturma);
        } 
        mediaescola = somanotasturmas / turmas;
        System.out.println("A media da escola é " + mediaescola);
       
    }
    
}
