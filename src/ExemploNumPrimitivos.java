public class ExemploNumPrimitivos {
    public static void main(String[] args) throws Exception {
        //System.out.println("irineu vc n sabe nem eu");
       //int significa tipo de informação inteiro
       //atribuição de valor - variavel = valor
    //entrada
        int primeironumero = 7; 
        int segundonumero = 2;
        
    //processamento
        int resultado = primeironumero + segundonumero;
        int resultadosub = primeironumero - segundonumero;
        float resultadodiv = (float)primeironumero / (float)segundonumero;
        int resultadomulti = primeironumero * segundonumero;

        
    //saida
    System.out.print("O resultado é: ");
    System.out.println(resultado);
    

    //concatenação
    System.out.println("O resultado é: " + resultado);

    //subtração
    System.out.println("O resultado subtraído é: " + resultadosub);

    //divisão
    System.out.println("O resultado dividido é: " + resultadodiv);
    System.out.println(String.format("O resultado dividido é: %.3f", resultadodiv));

    double resultadodivdouble = (double)primeironumero / (double)segundonumero;
    System.out.println(String.format("O resultado da divisão double: %4.3f", resultadodivdouble));

    //multiplicação
    System.out.println("O resultado multiplicado é: " + resultadomulti);
    

    //interpolação de String

    //tipo logico (booleano) = true ou false
    boolean resultadocomparacao = primeironumero == segundonumero;
    System.out.println(resultadocomparacao);
    System.out.println(resultadocomparacao?"Verdadeiro":"Falso");

    String nome = "Daniel Douglas dos Santos";
    System.out.println(nome.replace("a", "4"));

    char umaLetra = 'a';
    System.out.println(umaLetra);
    System.out.println((int)umaLetra);

    long numeromuitogrande = 10l;
    //a variavel INT nao suporta o valor long por conta do tamanho 
    //int vaidarruim = 10l
    System.out.println(numeromuitogrande);

    //int so suporta numero inteiro
    int salario = (int)1210.5f;
    System.out.println(salario);
    
    float salario2 = 1210.5f;
    System.out.println(salario2);

    //double tem 64bits e nao cabe dentro do float 32 (numero com . e 0)
    //float impostor = 1000.0;
    

  
   
    }
}
