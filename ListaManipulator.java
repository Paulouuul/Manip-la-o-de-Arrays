/**
 * Esta classe é uma classe de manipular vetores.
 * Ela contém um métodos para ordenar um vetor usando o algoritmo Bubble Sort, ordenar um vetor usando o algoritmo Selection Sort, ordenar um vetor usando o algoritmo Insertion Sort e realizar uma busca binária em um vetor ordenado.
 * @version 1
 */
public class ListaManipulator{


  /**
   * Ordena um vetor de inteiros usando o algoritmo de ordenação Bubble Sort.
   *
   * @param vetor O vetor a ser ordenado.
   */
  public void bubbleSort(int[] vetor) {

    for (int i = 0; i < vetor.length - 1; i++) {

      int troca = 0;

      for (int j = 0; j < vetor.length - 1 - i; j++) {
        if (vetor[j] > vetor[j + 1]) {
          troca = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = troca;
        }  
      }    
    }  
  }

  // Selection sort

  /**
   * Ordena um vetor de inteiros usando o algoritmo de ordenação Selection Sort.
   *
   * @param vetor O vetor a ser ordenado.
   */
  public void selectionSort(int[] vetor){

    for (int i = 0; i < vetor.length - 1; i++) {
      int menor_i = i;
      for (int j = i + 1; j < vetor.length; j++) {
        if (vetor[j] < vetor[menor_i]) {
          menor_i = j;
        }
      }
      int troca = vetor[menor_i];
      vetor[menor_i] = vetor[i];
      vetor[i] = troca;
    }

  }  

  // Insertion sort

  // Selection sort

  /**
   * Ordena um vetor de inteiros usando o algoritmo de ordenação Insertion Sort.
   *
   * @param vetor O vetor a ser ordenado.
   */
  public void insertionSort(int[] vetor) {
    for (int i = 1; i < vetor.length; i++) {
      int troca = vetor[i];
      int j = i - 1;
      while (j >= 0 && vetor[j] > troca) {
          vetor[j + 1] = vetor[j];
          j--;
      }
      vetor[j + 1] = troca;
    }
  }

  // Busca Binária


  /**
   * Realiza uma busca binária em um vetor de inteiros ordenado.
   *
   * @param vetor O de inteiros ordenado onde a busca será realizada.
   * @param busca O valor a ser buscado no no vetor.
   * @return O índice do valor buscado no vetor, ou -1 se o valor não for encontrado, ou -2 se o vetor não estiver ordenado.
   */
  public int buscaBinaria(int[] vetor, int busca) {
      Utilitarios Utilitarios = new Utilitarios();
      int inicio = 0;
      int fim = vetor.length - 1;

      int ordenado = Utilitarios.verificarOrdenado(vetor);

    if(ordenado == 1){
      return -2;
    }
    else{
      while (inicio <= fim) {

          int meio = inicio + (fim - inicio) / 2;

          if (vetor[meio] == busca) {
              return meio;
          }

          if (vetor[meio] > busca) {
              fim = meio - 1;
          }

          else {
              inicio = meio + 1;
          }
      }

      return -1;

  }


}
}
