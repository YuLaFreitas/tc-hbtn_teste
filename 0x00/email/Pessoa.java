public class Pessoa {
    public static boolean emailValid(String emal){
        boolean test = false;
            if(emal.contains("@")){
                if(emal.length() < 50){
                    test = true;
                }
            }

        return test;
    }



}
