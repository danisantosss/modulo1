import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A;
        int B;
        int C;
        int nulo;
        int branco;
        int votosvalidos = 0;
        int totalvotos;
        float percA;
        float percB;
        float percC;
        int percnulos;
        int percbranco;
        System.out.println("Digite a quantidade de votos para o candidato A");
        A = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos para o candidato B");
        B = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos para o candidato C");
        C = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos nulos");
        nulo = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a quantidade de votos em branco");
        branco = Integer.parseInt(leitor.nextLine());
        votosvalidos = A + B + C;
        totalvotos = A + B + C + nulo + branco;
        percA = A * 100f / votosvalidos;
        percB = B * 100f / votosvalidos;
        percC = C * 100f / votosvalidos;
        percnulos = nulo * 100 / totalvotos;
        percbranco = branco * 100 / totalvotos;
        System.out.println("A porcentagem de votos no candidato A é " + percA);
        System.out.println("A porcentagem de votos no candidato B é " + percB);
        System.out.println("A porcentagem de votos no candidato C é " + percC);
        System.out.println("A porcentagem de votos nulos é " + percnulos);
        System.out.println("A porcentagem de votos em branco é " + percbranco);

    } 
    
}
