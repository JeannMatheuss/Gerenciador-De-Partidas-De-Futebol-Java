public class Jogadora implements OperacaoCadastro{
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;

    public Jogadora(String nome, int idade, String posicao, int numeroCamisa) {
      this.nome = nome;
      this.idade = idade;
      this.posicao = posicao;
      this.numeroCamisa = numeroCamisa;
    }

    @Override
    public void cadastrar() {
        System.out.println("A jogadora " + nome + " foi cadastrada com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
