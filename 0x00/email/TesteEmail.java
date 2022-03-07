public class TesteEmail extends Pessoa{
    public static boolean testar_email_com_arroba(){
        return emailValid("email_teste@dominio.com.br")?
                true: false;
    }

    public static boolean testar_email_sem_arroba(){
        return emailValid("email_testedominio.com.br")?
                false: true;
    }

    public static boolean testar_email_mais_50_caracteres(){
        return emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br")?
                false: true;
    }
}
