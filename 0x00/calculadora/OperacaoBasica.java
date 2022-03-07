public class OperacaoBasica {

    public static double somar(double x, double y){
        return x+y;
    }

    public static double subtrair(double x, double y){
        return x-y;
    }

    public static double multiplicar(double x, double y){
        return x*y;
    }

    public static double dividir(double x, double y){
        return y != 0? x/y : 0;
    }
}
