package eva2_11_override_figuras;

public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    private double hipo;
    
    public Triangulo(){
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return ((base*altura)/2);
    }
    
    @Override
    public double calcularPeri(){
        hipo = Math.sqrt((base*base)+(altura*altura));
        return base+altura+hipo;
    }
    
    @Override
    public String toString(){
        String cade = "Datos triángulo:\n" + 
                      "Area: " + calcularArea() + "\n" +
                      "Perímetro: " + calcularPeri();
        return cade;
    }
}
