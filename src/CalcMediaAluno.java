import java.util.Scanner;

public class CalcMediaAluno {
 
    public static void main(String[] args) {
        //declaração de variaveis1
        //float nota1=0, nota2=0, nota3=0, nota4=0, media=0;
        //com final na linha seguinte iria bugar e travar tudo em 0, pq é variavel
        //float nota1=0, nota2=0, nota3=0, nota4=0;
        //VARIAVEL - TIPO E NOME = VALOR
        final float nota1, nota2, nota3, nota4;
        float percPresenca = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        //conversao entre tipo objeto pra tipo primitivo
        nota1 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        nota2 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        nota3 = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a quarta nota");
        nota4 = Float.parseFloat(leitor.nextLine());

        System.out.println("Digite o percentual de presença do aluno");
        //converte o texto digitado (nextline) de String para um primitivo float
        percPresenca = Float.parseFloat(leitor.nextLine());

        //constante = modificador final
        //"tipo" a palavra var permite que o java
        //crie a variavel com o tipo do valor que foi atribuido no código
        final var media = (nota1 + nota2 + nota3 + nota4) / 4.0f;

        System.out.println("A media do aluno é " + media);
    
        //Comparação entre valores

        boolean situacao = media >= 7 && percPresenca >= 75;

       System.out.println("Situação: " + (situacao?"Aprovado":"Reprovado"));

        //System.out.println(situacao?"Aprovado":"Reprovado");

        //REGRA aluno aprovado = media >= 7
        //REGRA aluno aprovado = percPresenca >= 75


        
        //media = 0;


 
    

        leitor.close();

        
    }
    
}
