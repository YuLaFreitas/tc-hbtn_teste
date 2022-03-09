package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {
    @Test
    public static boolean testar_email_com_arroba(){
            try{
                assertTrue(
                        Pessoa.emailValid("email_teste@dominio.com.br"));
            }catch (AssertionError e){
                return false;
            }
            return true;
    }

    @Test
    public static boolean testar_email_sem_arroba(){
        try{
            assertFalse(
                    Pessoa.emailValid("email_testedominio.com.br"));
        }catch (AssertionError e){
            return false;
        }
        return true;
    }

    @Test
    public static boolean testar_email_mais_50_caracteres(){
        try{
            assertEquals(false,
                    Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"));
        }catch (AssertionError e){
            return false;
        }
        return true;
    }
}
