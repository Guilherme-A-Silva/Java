package FolhaDePagamento;

public class TesteFolhaPagamento {
  public static void main(String[] args) {
    ProfissionalDeLimpeza Limpeza1 = new ProfissionalDeLimpeza("Roberta" , "Robs@gmail.com", "323232");
    Limpeza1.setSalarioFixo(2500);
    System.out.println(Limpeza1.getSalario());
  }
}
 