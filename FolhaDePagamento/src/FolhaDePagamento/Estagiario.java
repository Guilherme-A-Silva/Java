package FolhaDePagamento;

public class Estagiario extends Funcionario{

  public static final double VALOR_DA_BOLSA = 700.0;

  private String cursoDeGraduacao;

  public Estagiario(String nome, String email, String telefone, String cursoDeGraduacao) {
    super(nome, email, telefone);
    this.cursoDeGraduacao = cursoDeGraduacao;
  }

  public String getCursoDeGraduacao() {
    return cursoDeGraduacao;
  }

  public void setCursoDeGraduacao(String cursoDeGraduacao) {
    this.cursoDeGraduacao = cursoDeGraduacao;
  }
  
  
}
