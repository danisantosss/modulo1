import java.util.Scanner;

public class ExercicioDesafio {

    public static void main(String[] args) {
        
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = Integer.parseInt(leitor.nextLine());
        if (idade <= 20){
            //ENTAO
            System.out.println("JOVEM");
        }else{
            //SENAO
            if(idade <= 60){
                System.out.println("ADULTA");
            }else{
                System.out.println("IDOSO");
                leitor.close();
            
        /*if(idade <=20 && idade <=20){
            System.out.println("Você é jovem");
        }else 
        if(idade >20 && idade <60){
            System.out.println("Você é adulto");
         }if(idade >=60)
            System.out.println("Você é velho");
            //if (idade > 0 && idade <=20)
             sysout JOVEM
             */
        }
        }
         }
    
    
}
