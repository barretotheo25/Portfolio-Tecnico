public class Empresa{
  private String razaoSocial;
  private String nomeFantasia;
  private String cnpj;
  private String endereco;
  private String telefone;
  private String email;
  private String despesas;

  public Empresa(String razaoSocial, String nomeFantasia, String cnpj, String endereco, String telefone, String email, String despesas){
    this.razaoSocial = razaoSocial;
    this.nomeFantasia = nomeFantasia;
    this.cnpj = cnpj;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
    this.despesas = despesas;
  }

  public boolean contratarMotorista(String pis, String salario){
    return false;
  }

  public boolean pagarFuncionario(String salario, String pis){
    return true;
  }

  public boolean contratarFuncionario(String nome, String salario, String pis){
    return false;
  }
}
