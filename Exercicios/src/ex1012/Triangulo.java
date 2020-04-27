package ex1012;

public class Triangulo {
    private double base;
    private double altura;
    
    
    public Triangulo(){
    
    }
    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double AreaTriangulo(){
        double area;
        area = (this.base*this.altura)/2;
        return area;
    }
}
