package FolhaDePagamento;


public class Vendedor extends Funcionario{
  private double PercentualDeVendas, TotalDeVendas;
  public static final double PercentualMinimo = 0.01;

  public Vendedor(String nome, String email, String telefone, double percentualDeVendas, double totalDeVendas) {
    super(nome, email, telefone);
    PercentualDeVendas = percentualDeVendas;
    TotalDeVendas = totalDeVendas;
  }

  

  public Vendedor(String nome, String email, String telefone) {
    super(nome, email, telefone);
    this.PercentualDeVendas = PercentualMinimo;
  }

  public double getPercentualDeVendas() {
    return PercentualDeVendas;
  }

  public void setPercentualDeVendas(double percentualDeVendas) {
    if(percentualDeVendas > PercentualMinimo)
      this.PercentualDeVendas = percentualDeVendas;
  }

  public double getTotalDeVendas() {
    return TotalDeVendas;
  }

  public void setTotalDeVendas(double totalDeVendas) {
    TotalDeVendas = totalDeVendas;
  }
  @Override
  public double getSalario() {
    return (PercentualDeVendas*TotalDeVendas);
  }

}
