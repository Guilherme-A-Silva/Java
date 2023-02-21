package FolhaDePagamento;

public class Funcionario {
  private String Nome, Email, telefone;
  public static final double SalarioMinimo = 1400.00;
  public Funcionario(String nome, String email, String telefone) {
    Nome = nome;
    Email = email;
    this.telefone = telefone;
  }
  public String getNome() {
    return Nome;
  }
  public void setNome(String nome) {
    Nome = nome;
  }
  public String getEmail() {
    return Email;
  }
  public void setEmail(String email) {
    Email = email;
  }
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public double getSalario(){
    return SalarioMinimo;
  }
  @Override
  public String toString() {
    return "Funcionario [Nome=" + Nome + ", Email=" + Email + ", telefone=" + telefone+ "]";
  }
}
