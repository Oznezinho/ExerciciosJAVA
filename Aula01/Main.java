import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto scanner para ler a entrada do teclado
    Scanner scanner = new Scanner(System.in);

    // Solicitando o nome do Usuario
    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    // Solicitando o nome do Usuario
    System.out.print("Digite sua idade: ");
    String idade = scanner.nextLine();

    // Exibindo o que o Usuario digitou
    System.out.println("Olá, " + nome + "! Sua idade é " + idade);

    // Fechando o scanner
    scanner.close();
  }
}