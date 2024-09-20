public class Main {
  public static void main(String[] args) {

    // Instanciando o objeto Pessoa
    Pessoa pessoa1 = new Pessoa("Enzo", 18);
    Pessoa pessoa2 = new Pessoa("Bianca", 18);
    Pessoa pessoa3 = new Pessoa("Nehyne", 2);

    System.out.println(pessoa1.exibirInfo());
    System.out.println(pessoa1.getNome());
    System.out.println(pessoa1.getIdade());
  }
}
