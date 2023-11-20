/**
 * Esta classe é uma classe de Utilitários para manipular vetores.
 * Ela contém métodos para trocar valores de um vetor, imprimir valores de um vetor, multiplicar os valores de um vetor, verificar se o vertor está ordenado, procurar o maior valor do vetor e procurar o menor valor do vetor.
 * @author Cauã da G. C. S. Louzada, Paulo Ricardo Tebet Lyrio e Rafael Canejo.
 * @version 1
 */
public class Utilitarios{

  /**
   * Troca valores de 2 índices do vetor entre si.
   * 
   * @param vetor O vetor de números inteiros onde será realizada a troca de valores.
   * @param indice1 Um número inteiro que representa um índice do vetor.
   * @param indice2 Um número inteiro que representa outro índice do vetor.
   */
  public void trocarValores(int[] vetor, int indice1, int indice2) {

   int auxiliar;
    auxiliar = vetor[indice1];
    vetor[indice1] = vetor[indice2];
    vetor[indice2] = auxiliar;

  }

  /**
   * Imprime os elementos do vetor que ele recebeu como parâmetro na tela.
   *
   * @param vetor O vetor de inteiros que terá seus elementos impressos na tela.
   */
  public void imprimirVetor(int[] vetor){
    for(int i = 0; i< vetor.length; i++){
      System.out.print(vetor[i] + " ");
    }
    System.out.println("\n");


  }


  /**
   * Multiplica todos os elementos de um vetor por um número inteiro.
   *
   * @param vetor O vetor de números inteiros que será alterado.
   * @param num O número inteiro que servirá de multiplicador.
   */
  public void multiplicarVetor(int[] vetor, int num){
    for(int i = 0; i< vetor.length; i++){
      vetor[i] = vetor[i] * num;
    }
  }



  /**
   * Verifica se um vetor está ordenado.
   *
   * @param vetor O vetor de números inteiros que será analisado.
   * @return 0 se estiver ordenado, 1 se não estiver ordenado.
   */
  public int verificarOrdenado(int[] vetor){
    int ordenado = 0;

    for(int i = 0; i< vetor.length; i++){

    if( i != vetor.length - 1){
      if(vetor[i] > vetor[i+1]){
        ordenado = 1;
        break;
      }

    }

    }

    return ordenado;

  }


  /**
   * Este método retorna o maior valor de um vetor.
   *
   * @param vetor O vetor a ser analisado.
   * @return O maior valor do vetor.
   */
  public int maiorValor(int[] vetor){
    int maior = -99999;

    for(int i = 0; i< vetor.length; i++){

      if(vetor[i] > maior){
        maior = vetor[i];
      }

    }

    return maior;

  }


  /**
   * Este método retorna o menor valor de um vetor.
   *
   * @param vetor O vetor a ser analisado.
   * @return O menor valor do vetor.
   */
  public int menorValor(int[] vetor){
    int menor = 99999;

    for(int i = 0; i< vetor.length; i++){

      if(vetor[i] < menor){
        menor = vetor[i];
      }

    }

    return menor;

  }

}