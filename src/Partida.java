public class Partida {
    private Time timeCasa;
    private Time timeVisitante;
    private int golsCasa;
    private int golsVisitante;

    public Partida(Time timeCasa, Time timeVisitante, int golsCasa, int golsVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
        calcularResultado();
    }

    private void calcularResultado() {
        if (golsCasa > golsVisitante) {
            timeCasa.adicionarPontos(3);
        } else if (golsCasa < golsVisitante) {
            timeVisitante.adicionarPontos(3);
        } else {
            timeCasa.adicionarPontos(1);
            timeVisitante.adicionarPontos(1);
        }
    }
}
