package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TesteEmail {
    @Test
    public static boolean testar_email_com_arroba(){
        Pessoa pessoa = new Pessoa();
            try{
                assertTrue(
                        pessoa.emailValid("email_teste@dominio.com.br"));
            }catch (AssertionError e){
                return false;
            }
            return true;
    }

    @Test
    public static boolean testar_email_sem_arroba(){
        Pessoa pessoa = new Pessoa();
        try{
            assertFalse(
                    pessoa.emailValid("email_testedominio.com.br"));
        }catch (AssertionError e){
            return false;
        }
        return true;
    }

    @Test
    public static boolean testar_email_mais_50_caracteres(){
        Pessoa pessoa = new Pessoa();
        try{
            assertEquals(false,
                    pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"));
        }catch (AssertionError e){
            return false;
        }
        return true;
    }
}
