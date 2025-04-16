// TimeTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void testAdicionarJogadora() {
        Time time = new Time("Feras FC", "São Paulo");
        Jogadora jogadora = new Jogadora("Luiza", 24, "Goleira", 1);
        time.adicionarJogadora(jogadora);

        assertTrue(time.getJogadoras().contains(jogadora));
    }

    @Test
    public void testAdicionarPontos() {
        Time time = new Time("Feras FC", "São Paulo");
        time.adicionarPontos(3);
        assertEquals(3, time.getPontos());
    }
}
