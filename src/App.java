import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Quais são as entradas?
        //Pedir um número para o usuário
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        //Qual é o processamento?
        //Quais são as saídas?
        
        System.out.println("O número informado foi: " + numero);
    }
}
