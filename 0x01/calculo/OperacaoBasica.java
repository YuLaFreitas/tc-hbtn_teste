public class OperacaoBasica {

    public static double sqr(double x){
        return Math.sqrt(x);
    }

    public static String numero_primo(double x) {
        String saida = "";
            if(x <= 1){
                return "Número invalido. Numero menor ou igual a 1 não é primo ";
            }
            else {
                saida = "Numero válido, o numero é primo";
                for(int n = 2; n < x; n++ ) {
                    if (x % n == 0) {
                        return "Número válido, mas o numero não é primo";
                    }
                }

            }
        return saida;
    }

    public static double subtrair(double x, double y){
        return x-y;
    }

    public static double somar(double x, double y){
        return x+y;
    }

    public static double multiplicar(double x, double y){
        return x*y;
    }

    public static double dividir(double x, double y){
        return y != 0? x/y : 0;
    }
}
