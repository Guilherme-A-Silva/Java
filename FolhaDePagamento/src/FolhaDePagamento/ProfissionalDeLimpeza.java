package FolhaDePagamento;

public class ProfissionalDeLimpeza extends Funcionario{
  private double salarioFixo;

  public ProfissionalDeLimpeza(String nome, String email, String telefone, double salarioFixo) {
    super(nome, email, telefone);
    this.salarioFixo = salarioFixo;
  }


  public ProfissionalDeLimpeza(String nome, String email, String telefone) {
    super(nome, email, telefone);
    this.salarioFixo = super.getSalario();
  }


  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    if(salarioFixo> this.salarioFixo)
      this.salarioFixo = salarioFixo;
  }

  @Override
  public String toString() {
    return super.toString() + "ProfissionalDeLimpeza [salarioFixo=" + salarioFixo + "]";
  }
  @Override
  public double getSalario() {
    return salarioFixo;
  }
  
}
