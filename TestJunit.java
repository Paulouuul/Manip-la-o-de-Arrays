/**
 * A classe contém métodos de teste para as classes {@code ListaManipulator} e {@code Utilitarios}
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
public class TestJunit{

  /**
   * Testa o método bubbleSort na classe ListaManipulator.
   * Verifica se o método bubbleSort Sort retorna corretamente o vetor ordenado.
   */
  @Test
  public void testeBubbleSort(){
    ListaManipulator listaManipulator = new ListaManipulator();

    int[] vetor = {64, 34, 25, 12, 22, 11, 90};
    listaManipulator.bubbleSort(vetor);
    assertArrayEquals(vetor, new int[]{11,12,22,25,34,64,90});
  }


  /**
   * Testa o método selectionSort na classe ListaManipulator.
   * Verifica se o método selectionSort retorna corretamente o vetor ordenado.
   */
  @Test
  public void testeSelectionSort(){
    ListaManipulator listaManipulator = new ListaManipulator();

    int[] vetor = {64, 34, 25, 12, 22, 11, 90};
    listaManipulator.selectionSort(vetor);
    assertArrayEquals(vetor, new int[]{11,12,22,25,34,64,90});
  }


  /**
   * Testa o método insertionSort na classe ListaManipulator.
   * Verifica se o método selectionSort retorna corretamente o vetor ordenado.
   */
  @Test
  public void testeInsertionSort(){
    ListaManipulator listaManipulator = new ListaManipulator();

    int[] vetor = {64, 34, 25, 12, 22, 11, 90};
    listaManipulator.insertionSort(vetor);
    assertArrayEquals(vetor, new int[]{11,12,22,25,34,64,90});
  }

  /**
   * Testa o método buscaBinaria na classe ListaManipulator quando o vetor está ordenado e o valor está no vetor.
   *
   * Verifica se o método buscaBinaria retorna o índice correto para um elemento existente no vetor.
   */
  @Test
  public void testeBuscaBinaria_Ordenado_ValorNoVetor(){
    ListaManipulator listaManipulator = new ListaManipulator();

    int[] vetor = {11,12,22,25,34,64,90};
    int valor = listaManipulator.buscaBinaria(vetor,22);
    assertEquals(valor, 2);
  }

  /**
   * Testa o método buscaBinaria na classe ListaManipulator quando o vetor está ordenado e o valor não está no vetor.
   *
   * Verifica se o método buscaBinaria retorna -1 quando o valor não for encontrado.
   */
  @Test
  public void testeBuscaBinaria_Ordenado_ValorNaoEncontrado(){
    ListaManipulator listaManipulator = new ListaManipulator();

    int[] vetor = {11,12,22,25,34,64,90};
    int valor = listaManipulator.buscaBinaria(vetor,112);
    assertEquals(valor, -1);
  }

  /**
   * Testa o método buscaBinaria na classe ListaManipulator quando o vetor não está ordenado.
   *
   * Verifica se o método buscaBinaria retorna -2 quando o vetor não está ordenado.
   */
  @Test
  public void testeBuscaBinaria_NaoOrdenado(){
    ListaManipulator listaManipulator = new ListaManipulator();

    int[] vetor = {100,11,12,22,25,34,50,90,30};
    int valor = listaManipulator.buscaBinaria(vetor,112);
    assertEquals(valor, -2);
  }

  /**
   * Testa o método trocarValores na classe Utilitarios.
   *
   * Verifica se o método troca corretamente os valores do vetor entre si.
   */
  @Test
  public void testeTrocarValores(){
    Utilitarios Utilitarios = new Utilitarios();

    int[] vetor =  {64, 34, 25, 12, 22, 11, 90};
    Utilitarios.trocarValores(vetor,1,5);
    assertArrayEquals(vetor, new int[]{64, 11, 25, 12, 22, 34, 90});

  }


  /**
   * Testa o método multiplicarVetor na classe Utilitarios.
   *
   * Verifica se o multiplica corretamente todos os valores do vetor.
   */
  @Test
  public void testeMultiplicarVetor(){
    Utilitarios Utilitarios = new Utilitarios();

    int[] vetor =  {2,4,5,1,2};
    Utilitarios.multiplicarVetor(vetor,2);
    assertArrayEquals(vetor, new int[]{4,8,10,2,4});

  }


  /**
   * Testa o método verificarOrdenado na classe Utilitarios quando o vetor não está ordenado.
   *
   * Verifica se o método verificarOrdenado retorna 1 quando o vetor não está ordenado
   */
  @Test
  public void testeVerificarOrdenado_NaoOrdenado(){
    Utilitarios Utilitarios = new Utilitarios();

    int[] vetor =  {2,1,3};
    int valor = Utilitarios.verificarOrdenado(vetor);

    assertEquals(valor,1);

  }

  /**
   * Testa o método verificarOrdenado na classe Utilitarios quando o vetor está ordenado.
   *
   * Verifica se o método verificarOrdenado retorna 0 quando o vetor está ordenado
   */
  @Test
  public void testeVerificarOrdenado_Ordenado(){
    Utilitarios Utilitarios = new Utilitarios();

    int[] vetor =  {1,2,3};
    int valor = Utilitarios.verificarOrdenado(vetor);

    assertEquals(valor,0);

  }


  /**
   * Testa o método maiorValor na classe Utilitarios.
   * Verifica se o método maiorValor retorna o maior valor do vetor.
   */
  @Test
  public void testeMaiorValor(){
    Utilitarios Utilitarios = new Utilitarios();

    int[] vetor =  {1,2,3};
    int valor = Utilitarios.maiorValor(vetor);

    assertEquals(valor,3);

  }


  /**
   * Testa o método menorValor na classe Utilitarios.
   * Verifica se o método menorValor retorna o menor valor do vetor.
   */
  @Test
  public void testeMenorValor(){
    Utilitarios Utilitarios = new Utilitarios();

    int[] vetor =  {0,1,3};
    int valor = Utilitarios.menorValor(vetor);

    assertEquals(valor,0);

  }


}