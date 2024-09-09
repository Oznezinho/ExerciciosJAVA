
//Somando 2 números
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Criando um objeto Scanner
    Scanner scanner = new Scanner(System.in);

    // Primeiro número
    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    // Segundo número
    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    // Somando os números
    int soma = num1 + num2;

    // Exibindo o resultado
    System.out.println("A soma dos números é: " + soma);

    // Fechando o Scanner
    scanner.close();
  }
}