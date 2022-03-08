import static junit.framework.TestCase.assertEquals;

public class OperacaoBasicaTeste extends OperacaoBasica{
    public static boolean testar_sqrt(){
        try{
        assertEquals(7, sqr(49));
        }catch (AssertionError e){
            return false;
        }
        return true;
    }

    public static boolean testar_primo(){
        try {
            assertEquals(
                    "Numero válido, o numero é primo",
                    numero_primo(7));
        }catch (AssertionError e){
            return false;
        }
        return true;

    }

    public static boolean testar_nao_primo(){

        try{
        assertEquals(
                "Número válido, mas o numero não é primo",
                numero_primo(4)
        );
    }catch (AssertionError e){
            return false;
    }
        return true;
    }

    public static boolean testar_primo_menor_zero(){
        try{
        assertEquals(
                "Número invalido. Numero menor ou igual a 1 não é primo",
                numero_primo(-2)
                    );
        }catch (AssertionError e){
            return false;
        }
        return true;
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
