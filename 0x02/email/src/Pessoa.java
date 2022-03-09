package src;

public class Pessoa {
    public static boolean emailValid(String email){
        boolean test = false;
            if(email.contains("@")){
                if(email.length() < 50){
                    test = true;
                }
            }
        return test;
    }



}
