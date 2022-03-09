import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TesteEmail {
    private static Pessoa pessoa;

    @Test
    public void testar_email_com_arroba() {
        var resposta = Pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(resposta);
    }

    @Test
    public void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    void testar_email_mais_50_caracteres() {
        assertEquals(false,
                Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"));
    }

}