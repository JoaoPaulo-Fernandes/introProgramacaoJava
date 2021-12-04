import java.util.Scanner;

public class entradaESaidaSimples {
    public static void main (String[] args) {
        System.out.println("Olá!"); //Exibe a mensagem (Olá)

        System.out.print("Digite um número inteiro: "); //Exibe a mensagem (Digite um númer inteiro)
        Scanner s = new Scanner(System.in); //Prepara entrada de dados
        int valor = s.nextInt(); //Declara e inicia a variável
        System.out.println("O valor digitado é = " + valor); //Exibe o valo que foi inserido
        s.close(); //Fecha o objeto de leitura
    }
}