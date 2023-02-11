package FolhaDePagamento;

public class Gerente extends Funcionario{
  
  private Vendedor Vendedores[];
  private double SalarioFixo, PercentualDeComissao;

  public Gerente(String nome, String email, String telefone, Vendedor[] vendedores, double salarioFixo,
      double percentualDeComissao) {
    super(nome, email, telefone);
    Vendedores = vendedores;
    SalarioFixo = salarioFixo;
    PercentualDeComissao = percentualDeComissao;
    setSalario(CalculaSalario());
  }

  private double CalculaSalario(){
    double totalDeVendasDosVendedores = 0.0;

    /* for(int i =0; i<Vendedores.length; i++){
      totalDeVendasDosVendedores += V.getTotalDeVendas();
    }
    return SalarioFixo + PercentualDeComissao + totalDeVendasDosVendedores;
    } */
    
    for (Vendedor V : Vendedores) {
      totalDeVendasDosVendedores += V.getTotalDeVendas();
    }
    return SalarioFixo + PercentualDeComissao + totalDeVendasDosVendedores;
  }

  
}
