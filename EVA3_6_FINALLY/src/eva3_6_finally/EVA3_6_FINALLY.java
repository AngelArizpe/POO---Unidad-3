package eva3_6_finally;

public class EVA3_6_FINALLY {

    public static void main(String[] args) {
        
        
        int x = 9, y = 1;
        try{
        int resu = x/y;
        System.out.println("Resultado: " + resu);
        }catch(ArithmeticException e ){
            System.out.println("No se puede dividir entre 0");
        }finally{ //Obliga la ejecución de esta sección del código
            //Es opcional
            System.out.println("Siempre me voy a ejecutar");
        }
        System.out.println("Fin del programa");
        
    }
    
}
