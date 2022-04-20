public class Passageiro extends Pessoa{
  private String enderecoAtual;
  private String enderecosFavoritos;
  private String horarios;
  private String empresasFavoritas;

  private Passageiro(String nome, String telefone, String email, char genero, String cpf, String data_nascimento, String endereco, String enderecoAtual, String enderecosFavoritos, String horarios, String empresasFavoritas){
    super(nome, telefone, email, genero, cpf, data_nascimento, endereco);
    this.enderecoAtual = enderecoAtual;
    this.enderecosFavoritos = enderecosFavoritos;
    this.horarios = horarios;
    this.empresasFavoritas = empresasFavoritas;
  }

  private void cadastroPassageiro(String enderecosFavoritos, String horarios, String empresasFavoritas){
    
  }

  private boolean esperarOnibus(String enderecoAtual, String horarios, String empresasFavoritas){
    return false;
  }

  private void pegarOnibus(String enderecoAtual, String horarios){
    
  }

  private void descerDoOnibus(PontoOnibus pontoOnibus){
    
  }
}
