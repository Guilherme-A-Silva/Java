package FolhaDePagamento;

public class Vendedor extends Funcionario{
  private double PercentualDeVendas, TotalDeVendas;

  public Vendedor(String nome, String email, String telefone, double percentualDeVendas, double totalDeVendas) {
    super(nome, email, telefone);
    PercentualDeVendas = percentualDeVendas;
    TotalDeVendas = totalDeVendas;
    setSalario(percentualDeVendas*totalDeVendas);
  }

  public double getPercentualDeVendas() {
    return PercentualDeVendas;
  }

  public void setPercentualDeVendas(double percentualDeVendas) {
    PercentualDeVendas = percentualDeVendas;
    setSalario(percentualDeVendas*TotalDeVendas);
  }

  public double getTotalDeVendas() {
    return TotalDeVendas;
  }

  public void setTotalDeVendas(double totalDeVendas) {
    TotalDeVendas = totalDeVendas;
    setSalario(PercentualDeVendas*totalDeVendas);
  }

}
