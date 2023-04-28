import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveRetornarClassificacaoFilme() {
        Filme filme = new Filme();
        filme.setClassificacao("PG");

        assertEquals("PG", filme.getClassificacao());
    }

    @Test
    void deveRetornarIdadeIndicadaFilme() {
        Filme filme = new Filme();
        filme.setClassificacao("PG-13");

        assertEquals(13, filme.getIdadeIndicada());
    }
}






