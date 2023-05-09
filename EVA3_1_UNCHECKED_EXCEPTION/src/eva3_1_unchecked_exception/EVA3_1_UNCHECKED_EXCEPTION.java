package eva3_1_unchecked_exception;
import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTION {

    public static void main(String[] args) {
        //Son todas de RunTime Exception
        
        //Arithmetic exception
        //Ejemplo: división entre 0
        
        System.out.println("Iniciando el programa");
        int x = 5, y =0;
        System.out.println("Inicializando las variables");
        int resu = x/y;
        System.out.println("Calculando la división");
        System.out.println("División = " + resu); 
        
        //InputMisMatch exception: Error de captura
        //Si se introduce texto, no se puede convertir a entero
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = input.nextInt();
        System.out.println("Tu número es: " + num); 
        
        //InedxOutOfBounds Exception
        
        int[] arreglo = new int[5]; //0 - (n-1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //Error de lógica: 5 no es una posición válida
        
        //NullPointer Exception
        Prueba objPrueba = null;
        System.out.println("Valor de x: " + objPrueba.x);
    }
    
}

class Prueba{
    public int x = 100;
}