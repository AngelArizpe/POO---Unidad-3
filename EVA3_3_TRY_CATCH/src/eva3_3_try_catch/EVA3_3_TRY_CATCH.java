package eva3_3_try_catch;

public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        int x = 5, y = 0;
        try { //Bloque de código QUE PUEDE causar una excepción
            int resu = x/y;
            System.out.println("Resultado: " + resu);
        }catch(ArithmeticException e){
            //Bloque de código que captura y atiende la excepción
            System.out.println("Excepción: " + e.getMessage());
        }
        System.out.println("Fin del programa");
    }
    
}
