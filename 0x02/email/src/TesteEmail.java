package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteEmail {
    private static final Pessoa pessoa = new Pessoa();
    @Test
    void testar_email_com_arroba(){
                assertTrue(
                        pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    void testar_email_sem_arroba(){
            assertFalse(
                    pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    void testar_email_mais_50_caracteres(){
            assertEquals(false,
                    pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"));
    }
}
