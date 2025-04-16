// JogadoraTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JogadoraTest {

    @Test
    public void testCadastroJogadora() {
        Jogadora jogadora = new Jogadora("Ana", 22, "Atacante", 9);
        assertEquals("Ana", jogadora.getNome());
        assertEquals(22, jogadora.getIdade());
        assertEquals("Atacante", jogadora.getPosicao());
        assertEquals(9, jogadora.getNumeroCamisa());
    }
}
