/*Crie uma classe Elevador para armazenar as informações de um elevador de prédio. 
A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele.
A classe deve também disponibilizar os seguintes métodos:
Inicializar: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio) 
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço)
Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele)
Subir: para subir um andar (não deve subir se já estiver no último andar)
Descer: para descer um andar (não deve descer se já estiver no térreo) */

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    class MainClass {
      int totalAndares, capacidade, andarAtual, QtdeDentro;
    }
    MainClass elevador = new MainClass();
    System.out.println("Informe a função (Inicializar, Entrar, Sair, Subir, Descer): ");
    String funcao = sc.nextLine();
    if (funcao.equals("Inicializar")) {
      System.out.println("Informe a capacidade do elevador: ");
      elevador.capacidade = sc.nextInt();
      System.out.println("Informe o total de andares no prédio: ");
      elevador.totalAndares = sc.nextInt();
    }
    System.out.println("A capacidade do elevador é " + elevador.capacidade + " e o total de andares é " + totalAndares);
    System.out.println("Informe o próximo passo (Entrar, Sair, Subir, Descer): ");
    String proximoPasso = sc.nextLine();
    if (proximoPasso.equals("Entrar")) {
      System.out.println("Informe a quantidade de pessoas que entrarão: ");
      int entrar = sc.nextInt();
      if (entrar <= elevador.capacidade) {
        elevador.QtdeDentro = elevador.QtdeDentro + entrar;
        System.out.println("A quantidade de pessoas dentro do elevador é " + elevador.QtdeDentro);
      } else {
        System.out.println("Não é possível entrar mais pessoas");
      } 
      if (proximoPasso.equals("Sair")) {
        System.out.println("Informe a quantidade de pessoas que sairão: ");
        int sair = sc.nextInt();
        if (sair <= elevador.QtdeDentro) {
          elevador.QtdeDentro = elevador.QtdeDentro - sair;
          System.out.println("A quantidade de pessoas dentro do elevador é " + elevador.QtdeDentro);
        } else {
          System.out.println("Não é possível sair mais pessoas");
        }
        if (proximoPasso.equals("Subir")) {
          if (elevador.andarAtual < elevador.totalAndares) {
            elevador.andarAtual = elevador.andarAtual + 1;
            System.out.println("O elevador está no andar " + elevador.andarAtual);
          } else {
            System.out.println("O elevador já está no último andar");
          }
          if (proximoPasso.equals("Descer")) {
            if (elevador.andarAtual > 0) {
              elevador.andarAtual = elevador.andarAtual - 1;
              System.out.println("O elevador está no andar " + elevador.andarAtual);
            } else {
              System.out.println("O elevador já está no térreo");
        }
      }
      
    }
  }
}
  }