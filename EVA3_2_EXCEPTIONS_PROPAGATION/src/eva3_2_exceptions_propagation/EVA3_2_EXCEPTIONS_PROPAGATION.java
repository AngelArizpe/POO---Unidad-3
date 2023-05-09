package eva3_2_exceptions_propagation;

public class EVA3_2_EXCEPTIONS_PROPAGATION {

    public static void main(String[] args) {
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
    public static void C(){
        System.out.println("Inicia C");
        int x = 5, y = 0;
        int z = x/y; //Arithmetic Exception
        System.out.println("Resultado: " + z);
        System.out.println("Termina C");
    }
}
