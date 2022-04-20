public class Pessoa{
  private String nome;
  private String telefone;
  private String email;
  private char genero;
  private String cpf;
  private String data_nascimento;
  private String endereco;

  public Pessoa(String nome, String telefone, String email, char genero, String cpf, String data_nascimento, String endereco){
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    this.genero = genero;
    this.cpf = cpf;
    this.data_nascimento = data_nascimento;
    this.endereco = endereco;
  }

  public boolean baixarAplicativo (){
    return true;
  }

  public void cadastroBasicoApp (String nome, String telefone, String email, char genero, String cpf, String data_nascimento, String endereco){
    
  }
}
