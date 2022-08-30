public class Exercicio59 {

    public static void main(String[] args) {
        int celsius = 0;
        float fahrenhait = 0;
        while(celsius <100){
            celsius+=10;
            fahrenhait = (celsius * 9/5) + 32;
            System.out.println("Temperatura em celsius é " + celsius);
            System.out.println("Temperatura em fahrenhait " + fahrenhait);
            
        }
    }
    
}
