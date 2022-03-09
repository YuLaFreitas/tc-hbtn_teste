package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteEmail {
    @Test
    void testar_email_com_arroba(){
                assertTrue(
                        Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    void testar_email_sem_arroba(){
            assertFalse(
                    Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    void testar_email_mais_50_caracteres(){
            assertEquals(false,
                    Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"));
    }
}
