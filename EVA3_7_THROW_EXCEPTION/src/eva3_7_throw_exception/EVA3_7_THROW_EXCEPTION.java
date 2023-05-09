package eva3_7_throw_exception;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        //Checked exception si debes resolverlas ya que si marca error el código
        //Unchecked exception no es forzoso resolverlas ya que el código no marca errores
        
        Prueba objeto = new Prueba();
        try {
            objeto.capturMayorCero(100);
            System.out.println("Introduce un valor");
            Scanner input = new Scanner(System.in);
            int valor = input.nextInt();
            
            //Exception es la superclase de las excepciones
            //Si es una excepción, no importa cual, la va a capturar
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        
        //ArithmeticException no es obligatorio atenderla
        try{
        objeto.división(100, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}

class Prueba{
    //Exception es checked exception, estamos obligados a atenderla
    public void capturMayorCero(int valor) throws Exception{
        if(valor <= 0) //Generamos una excepción
            throw new Exception(valor + " es negativo, solo se acpetan valores positivos");
            System.out.println("El valor es: " + valor);
        
    }
    
    public int división(int x, int y) throws ArithmeticException{
        if(y==0)
            throw new ArithmeticException("No se puede dividir entre 0");
        return x/y;
    }
    
}