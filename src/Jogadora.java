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
        System.out.println("A jogadora " + nome + "foi cadastrada com sucesso!");
    }
}
