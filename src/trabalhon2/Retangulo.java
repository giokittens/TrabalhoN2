package trabalhon2;


public class Retangulo extends FG {

     public double base;
    private double altura;
    public double area;
    private double perimetro;
    

    public Retangulo() {
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
    public double calcularArea() {
        this.area = this.getAltura() * this.getBase();
        return this.area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = this.getAltura() *2 +  this.getBase() * 2;
        return this.perimetro;
    }
    
    
    
}
