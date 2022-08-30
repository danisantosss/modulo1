import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        float notaum, notadois, notatres, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        notaum = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a segunda nota");
        notadois = Float.parseFloat(leitor.nextLine());
        System.out.println("Digite a terceira nota");
        notatres = Float.parseFloat(leitor.nextLine());
        media = (notaum + notadois + notatres) / 3;
        System.out.println("A média é " + media);

        if(media < 3){
            System.out.println("Parabéns você reprovou!!!");
         } else {
             if(media>=7){
                System.out.println("Parabéns você passou, sua nota é " + media);
          } else {
              System.out.println("Você está em exame, sua nota é " + media);
          } leitor.close();
         }
        }
    
       }
