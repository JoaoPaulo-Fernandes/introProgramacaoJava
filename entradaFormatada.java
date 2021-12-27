import java.util.Scanner;

public class entradaFormatada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //Proporciona a entrada de dados
        System.out.print("Digite uma palavra: "); //Mensagem para auxiliar o usuário
        String palavra = s.next();
        s.nextLine(); //Limpa a entrada de dados após a leitura das Strings.
        System.out.print("Digite uma frase: ");
        String frase = s.nextLine();
        System.out.println("A palavra digitada é: " + palavra + " e a frase digitda é: " + frase);
        s.close(); //Fecha o objeto de leitura
    }
}
