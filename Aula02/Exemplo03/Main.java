//Definir a Classe Pessoa
class Pessoa {
  // Definir os atributos
  String nome;
  int idade;

  // Constructor para inicializar os atributos
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Metodos para exibir os dados
  public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}

public class Main {
  public static void main(String[] args) {
    // Criar um objeto da classe Pessoa
    Pessoa pessoa1 = new Pessoa("Enzo ", 18);
    Pessoa pessoa2 = new Pessoa("Bianca ", 18);

    // Alunos
    Pessoa pessoa3 = new Pessoa("Jonathan ", 17);
    Pessoa pessoa4 = new Pessoa("Francisco ", 17);
    Pessoa pessoa5 = new Pessoa("Miguel ", 17);
    Pessoa pessoa6 = new Pessoa("Tauã ", 18);
    Pessoa pessoa7 = new Pessoa("Laura ", 16);

    // Chamar o metodo exibirDados para cada objeto
    pessoa1.exibirDados();
    pessoa2.exibirDados();
    pessoa3.exibirDados();
    pessoa4.exibirDados();
    pessoa5.exibirDados();
    pessoa6.exibirDados();
    pessoa7.exibirDados();
  }
}