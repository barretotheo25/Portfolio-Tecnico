public class Motorista extends Pessoa{
  private String horarioDeTrabalho;
  private Empresa empresa;
  private String salario;
  private String pis;
  private String funcao;
  private boolean bateuPonto;

  public Motorista (String nome, String telefone, String email, char genero, String cpf, String data_nascimento, String endereco, String horarioDeTrabalho, Empresa empresa, String salario, String pis, String funcao, boolean bateuPonto){
    super(nome, telefone, email, genero, cpf, data_nascimento, endereco);
    this.horarioDeTrabalho = horarioDeTrabalho;
    this.empresa = empresa;
    this.salario = salario;
    this.pis = pis;
    this.funcao = funcao;
    this.bateuPonto = bateuPonto;
  }

  public void cadastroMotorista(String horarioDeTrabalho, Empresa empresa, String pis){
    
  }

  public void irTrabalhar(String horarioDeTrabalho, Empresa empresa, Onibus onibus){
    
  }

  public boolean fazerRotaOnibus(Rotas rotas, Onibus onibus, PontoOnibus pontoOnibus){
    return true;
  }

  public void baterPonto(String horarioDeTrabalho, String pis){
    
  }

  public void receberSalario(String pis){
    
  }
}
