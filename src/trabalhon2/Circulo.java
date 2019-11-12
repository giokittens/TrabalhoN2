package trabalhon2;

public class Circulo extends FG {
    
    private double area;
    private double PI = 3.14159;
    private double raio;
    private double perimetro;

  
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        this.area = this.PI * this.raio * this.raio;
        return this.area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * this.PI * this.raio;
        return this.perimetro;
    }
    
    
    
}
