// PartidaTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PartidaTest {

    @Test
    public void testVitoriaTimeCasa() {
        Time casa = new Time("Feras FC", "São Paulo");
        Time visitante = new Time("Estrelas United", "Rio de Janeiro");

        new Partida(casa, visitante, 2, 1);

        assertEquals(3, casa.getPontos());
        assertEquals(0, visitante.getPontos());
    }

    @Test
    public void testVitoriaTimeVisitante() {
        Time casa = new Time("Feras FC", "São Paulo");
        Time visitante = new Time("Estrelas United", "Rio de Janeiro");

        new Partida(casa, visitante, 0, 1);

        assertEquals(0, casa.getPontos());
        assertEquals(3, visitante.getPontos());
    }

    @Test
    public void testEmpate() {
        Time casa = new Time("Feras FC", "São Paulo");
        Time visitante = new Time("Estrelas United", "Rio de Janeiro");

        new Partida(casa, visitante, 2, 2);

        assertEquals(1, casa.getPontos());
        assertEquals(1, visitante.getPontos());
    }
}
