package ex1012;

public class Circulo {
    private double raio;
    final static double PI = 3.14159;

    public Circulo(){
        
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double AreaCirculo(){
        double area;
        area = PI * Math.pow(this.raio,2);
        return area;
    }
}
