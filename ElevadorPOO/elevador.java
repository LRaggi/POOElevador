public class elevador {
  int totalAndares, capacidade, andarAtual, QtdeDentro;
  public void inicializar(int capacidade, int totalAndares) {
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
  
}
  public void entrar(int entrar) {
    if (entrar <= capacidade) {
      QtdeDentro = QtdeDentro + entrar;
      System.out.println("A quantidade de pessoas dentro do elevador é " + QtdeDentro);
    } else {
      System.out.println("Não é possível entrar mais pessoas");
    }
    public void sair(int sair) {
      if (sair <= QtdeDentro) {
        QtdeDentro = QtdeDentro - sair;
        System.out.println("A quantidade de pessoas dentro do elevador é " + QtdeDentro);
      } else {
        System.out.println("Não é possível sair mais pessoas");
      }
      public void subir(int subir) {
        if (andarAtual < totalAndares) {
          andarAtual = andarAtual + 1;
          System.out.println("O elevador está no andar " + andarAtual);
        } else {
          System.out.println("O elevador já está no último andar");
        }
        public void descer(int descer) {
          if (andarAtual > 0) {
            andarAtual = andarAtual - 1;
            System.out.println("O elevador está no andar " + andarAtual);
          } else {
            System.out.println("O elevador já está no térreo");
          }
        }
      }
    }
  }
}