package FolhaDePagamento;

public class ProfissionalDeLimpeza extends Funcionario{
  private double salarioFixo;

  public ProfissionalDeLimpeza(String nome, String email, String telefone, double salarioFixo) {
    super(nome, email, telefone);
    this.salarioFixo = salarioFixo;
    setSalario(salarioFixo);
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
    setSalario(salarioFixo);
  }

  @Override
  public String toString() {
    return super.toString() + "ProfissionalDeLimpeza [salarioFixo=" + salarioFixo + "]";
  }

  
}