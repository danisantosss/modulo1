import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salariobase, tempo, imposto, gratificacao, auxilio, SALARIOTOTAL;
        String nome;
        System.out.println("Digite o seu nome");
        nome = leitor.nextLine();
        System.out.println("Digite o salário base");
        salariobase = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite o tempo de serviço");
        tempo = Float.parseFloat(leitor.nextLine());

        if(salariobase <= 200){
            imposto = salariobase * 0 / 100;
            System.out.println("Isento de impostos");
        } else {
            if(salariobase > 200 && salariobase <= 450){
                imposto = salariobase * 3 / 100;
                System.out.println("O total de imposto é " + imposto);
            } else {
                if(salariobase > 450 && salariobase < 700){
                    imposto = salariobase * 8 / 100;
                    System.out.println("O total de imposto é " + imposto);
                } else {
                    if(salariobase == 700){
                        imposto = salariobase * 10 / 100;
                        System.out.println("O total de imposto é " + imposto);
                    } else {
                        imposto = salariobase * 12 / 100;
                        System.out.println("O total de imposto é " + imposto);
                    }   
                }
            }  

        } if(salariobase > 500 && tempo <= 3){
            gratificacao = (salariobase * 2 / 100) + 50;
            System.out.println("O valor da gratificação é " + gratificacao);
        } else {
            if(salariobase > 500 && tempo > 3){
                gratificacao = (salariobase * 3 / 100) + 60;
                System.out.println("O valor da gratificação é " + gratificacao);
            } else {
                if(salariobase <= 500 && tempo <= 3){
                gratificacao = (salariobase * 5 / 100) + 23;
                System.out.println("O valor da gratificação é " + gratificacao);
            } else {
                if(salariobase <= 500 && tempo >= 6){
                    gratificacao = (salariobase * 10 / 100) + 33;
                    System.out.println("O valor da gratificação é " + gratificacao);
                } else {
                    gratificacao = (salariobase * 6 / 100) + 35;
                    System.out.println("O valor da gratificação é " + gratificacao);
                    }
                }
            }
        } if(tempo <= 10){
            auxilio = salariobase * 4 / 100;
            System.out.println("O valor do auxilio é " + auxilio);
        } else {
                auxilio = salariobase * 6 / 100;
                System.out.println("O valor do auxilio é " + auxilio); 
            }
                SALARIOTOTAL = salariobase + auxilio + gratificacao - imposto;
                System.out.println("O SALÁRIO LÍQUIDO TOTAL É " + SALARIOTOTAL);
    } 
    
}
