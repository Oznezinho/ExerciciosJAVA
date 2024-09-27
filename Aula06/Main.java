import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    //Criando um ARRAY de INTEIROS
    int[] numbers = {8, 1, 3, 2, 6, 0};
    System.out.println("Meu array de números: " + Arrays.toString(numbers));

    //Acessando um elemento pelo index[]
    System.out.println("O elemento da posição 2 é: " + numbers[1]);

    //Modificando um valor especifico no ARRAY
    numbers[1] = 10;
    System.out.println("O novo valor da posição 2 é: " + numbers[1]);
    System.out.println("Meu array de números: " + Arrays.toString(numbers));

    //Criando um ARRAY de STRINGS
    String[] frutas = {"Maçã", "Uva", "Pera", "Morango", "Melão", "João Bolão", "Amora"};

    //Exibindo lista de Frutas
    for(int i = 0; i < frutas.length; i++){
      System.out.println((i + 1) + "º Fruta: " + frutas[i]);
    }
    //Instanciando um ARRAY de STRINGS
    String[] carros = new String[4];

    //Add carros
    carros[0] = "Fusca";
    carros[1] = "Gol";
    carros[2] = "Corsa";
    carros[3] = "Uno";

    System.out.println("-------------------------");
    for(int i = 0; i < carros.length; i++){
      System.out.println((i + 1) + "º Carro: " + carros[i]);
    }

    //Ordenando um ARRAY em ordem crescente
    Arrays.sort(numbers);
    System.out.println("Meu array de números crescentes ordenado: " + Arrays.toString(numbers));
    //Ordenando um ARRAY em ordem decrescente
    Integer[] numeros = {8, 1, 3, 2, 6, 0};
    Arrays.sort(numeros, Collections.reverseOrder());
    System.out.println("Meu array de números decrescentes ordenado: " + Arrays.toString(numeros));

    //Buscando um elemento no ARRAY pelo metodo BINARY SEARCH
    int index = Arrays.binarySearch(numbers, 10);
    if(index >= 0){
      System.out.println("Valor encontrado na posição: " + index);
    } else{
      System.out.println("Valor não foi encontrado");
    }

    //Pocurando um elemento no ARRAY com um determinado valor
    int[] lista = new int[5];
    Arrays.fill(lista,1);
    System.out.println("Meu array de números: " + Arrays.toString(lista));
  }
}