public class Person {

    public Person() {
    }

    public boolean checkUser(String usuario) {
        return !usuario.contains("!@#$%&*") && usuario.length() >= 8;
    }

    /**
     *
     * @param senha
     * @return Metodo testa presença de caracateres especias e letras maiusculas "abc12B#" true "abc" false
     */
    public boolean checkPassword(String senha) {
       String regex  = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$";
        return senha.matches(regex);
    }
}