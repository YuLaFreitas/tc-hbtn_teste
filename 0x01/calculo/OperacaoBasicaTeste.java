public class OperacaoBasicaTeste extends OperacaoBasica{
    public static boolean testar_sqrt(){
        return sqr(49) == 7;
    }

    public static boolean testar_primo(){
       return "Numero válido, o numero é primo".equals(
                    numero_primo(7));
    }

    public static boolean testar_nao_primo(){

                return "Número válido, mas o numero não é primo".equals(
                numero_primo(4)
        );
    }

    public static boolean testar_primo_menor_zero(){
       return "Número invalido. Numero menor ou igual a 1 não é primo".equals(
                numero_primo(-2)
                    );
    }

    public static boolean testar_subtracao(){
        return subtrair(5,3) == 2;
    }

    public static boolean testar_soma(){
        return somar(5,3) == 8;
    }

    public static boolean testar_multiplicacao(){
        return multiplicar(5,3) == 15;
    }

    public static boolean testar_divisao(){
        return dividir(9,3) == 3;
    }

}
