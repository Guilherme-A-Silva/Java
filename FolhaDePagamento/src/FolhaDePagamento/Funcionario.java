package FolhaDePagamento;

public class Funcionario {
  String Nome, Email, telefone;
  double Salario;

  public Funcionario(String nome, String email, String telefone) {
    Nome = nome;
    Email = email;
    this.telefone = telefone;
    Salario = 0.0;
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
  public double getSalario() {
    return Salario;
  }
  public void setSalario(double salario) {
    Salario = salario;
  }
  @Override
  public String toString() {
    return "Funcionario [Nome=" + Nome + ", Email=" + Email + ", telefone=" + telefone + ", Salario=" + Salario + "]";
  }
}
