

import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    // RODAR O MAIN DO OBJ TESTRUNNER
    TestRunner tr = new TestRunner();

    ListaManipulator listaManipulator = new ListaManipulator();
    Utilitarios Utilitarios = new Utilitarios();

    // DECLARAR LISTA
    int[] vetor = {64, 34, 25, 12, 22, 11, 90};

    // TELA INICIAL
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nEscolha uma opção:\n");
      System.out.println("1) Ordenar lista");
      System.out.println("2) Verificar se a lista está ordenada");
      System.out.println("3) Realizar busca binária");
      System.out.println("4) Realizar testes no programa");
      System.out.println("5) Informar o maior valor da lista");
      System.out.println("6) Informar o menor valor da lista");
      System.out.println("7) Trocar a posição de 2 valores da lista");
      System.out.println("8) Multiplicar valores da lista");
      System.out.println("9) Imprimir lista");
      System.out.println("0) Sair");

      System.out.print("\n> ");
      int opcao = scanner.nextInt();
      System.out.print("\n");
      
      switch (opcao) {
        case 1:
          System.out.println("\nEscolha o método de ordenação:\n");
          System.out.println("1) Bubble Sort");
          System.out.println("2) Selection Sort");
          System.out.println("3) Insertion Sort");
          System.out.println("0) Voltar");

          System.out.print("\n> ");
          int opcao_ordenar = scanner.nextInt();
          System.out.print("\n");
          
          switch (opcao_ordenar) {
            case 1:
              listaManipulator.bubbleSort(vetor);
              break;
            case 2:
              listaManipulator.selectionSort(vetor);
              break;
            case 3:
              listaManipulator.insertionSort(vetor);
              break;
            case 0:
              System.out.println("\nVoltando à tela inicial.");

            default:
              System.out.println("Opção inválida. Tente novamente.");
          break;
          }

        case 2:
          int ordenado = Utilitarios.verificarOrdenado(vetor);
          if(ordenado == 0){
            System.out.println("A lista está ordenada.");
          }
          else{
            System.out.println("A lista não está ordenada");
          }
          break;

        case 3:
          int ordenado2 = Utilitarios.verificarOrdenado(vetor);

          if(ordenado2 == 0){
            System.out.print("Digite um valor da lista para receber sua posição: ");
            int busca = scanner.nextInt();

            int posicao = listaManipulator.buscaBinaria(vetor, busca);

            if(posicao == -1){
              System.out.println("Este valor não se encontra na lista.");
              break;
            }
            else{
              System.out.println("\nO número "+ busca + " está na posição " + posicao + ".");
            } 
          }
          else{
            System.out.println("A lista não está ordenada, favor ordenar.");
          }
          break;

        case 4: 
          tr.main();
          break;

        case 5: 
          int maior = Utilitarios.maiorValor(vetor);
          System.out.println("O maior valor da lista é " + maior + ".");
          break;

        case 6: 
          int menor = Utilitarios.menorValor(vetor);
          System.out.println("O menor valor da lista é " + menor + ".");
          break;

        case 7:
          System.out.print("Digite a posição do valor que deseja trocar: ");
          int indice1 = scanner.nextInt();

          if(indice1 > vetor.length || indice1 < 0){
            System.out.println("\nPosição inválida.");
            break;
          }
          
          System.out.print("\nDigite a posição do segundo valor que deseja trocar: ");
          int indice2 = scanner.nextInt();

          if(indice2 > vetor.length || indice2 < 0){
            System.out.println("\nPosição inválida.");
            break;
          }
          
          Utilitarios.trocarValores(vetor, indice1, indice2);
          break;

        case 8:
          System.out.print("\nInforme o multiplicador: ");
          int num = scanner.nextInt();

          Utilitarios.multiplicarVetor(vetor, num);
          break;

        case 9:
          System.out.println("A lista atual é: ");
          Utilitarios.imprimirVetor(vetor);
          break;

        case 0:
          System.out.println("\n PROGRAMA ENCERRADO");
          scanner.close();
          System.exit(0);

        default:
          System.out.println("Opção inválida.");
      }

      System.out.println("\nRetornar para a tela inicial?");
      System.out.println("1) Sim");
      System.out.println("0) Não");

      System.out.print("\n> ");
      int opcao_sair = scanner.nextInt();
      
      switch (opcao_sair) {
        case 1:
          break;
        case 0:
          System.out.println("\n PROGRAMA ENCERRADO");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
  }
}
