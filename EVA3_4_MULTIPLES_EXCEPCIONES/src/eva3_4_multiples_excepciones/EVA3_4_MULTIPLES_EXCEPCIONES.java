package eva3_4_multiples_excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x, y;
        
        do{
            try{
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce el valor de x: ");
            x = input.nextInt();
            System.out.println("Introduce el valor de y: ");
            y = input.nextInt();
            
            break;
       
            }catch(InputMismatchException e){
            System.out.println("La captura es incorrecta, vuelva a capturar con números enteros: " + e.getMessage());
            }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0: " + e.getMessage());
            }
        }while(true);
            int resu = x/y;
            System.out.println("Resultado de la división: " + resu);
        
        System.out.println("Programa terminado con éxito");
        }
        
    }
    

