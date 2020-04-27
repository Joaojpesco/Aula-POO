package ex1012;

public class Quadrado {
    private double lado;
    
    public Quadrado(){
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double AreaQuadrado(){
        double area;
        area = Math.pow(this.lado,2);
        
        return area;
    }
}
