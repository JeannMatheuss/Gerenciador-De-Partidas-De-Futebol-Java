import java.util.ArrayList;
import java.util.List;

public class Time implements OperacaoCadastro{
    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras = new ArrayList<>();
    private int pontos = 0;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void adicionarJogadora(Jogadora jogadora) {
        jogadoras.add(jogadora);
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    @Override
    public void cadastrar() {
        System.out.println("Time " + nome + " da cidade " + cidade + " cadastrado com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Jogadora> getJogadoras() {
        return jogadoras;
    }

    public void setJogadoras(List<Jogadora> jogadoras) {
        this.jogadoras = jogadoras;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
