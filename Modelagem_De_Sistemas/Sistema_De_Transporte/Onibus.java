public class Onibus{
  private String marca;
  private boolean articulado;
  private Empresa empresa;
  private int numeroIdentificacao;

  public Onibus(String marca, boolean articulado, Empresa empresa, int numeroIdentificacao){
    this.marca = marca;
    this.articulado = articulado;
    this.empresa = empresa;
    this.numeroIdentificacao = numeroIdentificacao;
  }

  public void levarPassageiros(Passageiro passageiro, Motorista motorista){
    
  }
}
