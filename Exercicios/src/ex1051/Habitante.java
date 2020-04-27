package ex1051;

public class Habitante {
    double salario;

    public Habitante(){
        
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Double CalculaSalario4500(){
        double valor = this.salario;
        double imposto = 1000*0.08 + 1500*0.18;
        double dife = valor - 4500;
        imposto += dife *0.28;
        return imposto;
    }
    public Double CalculaSalario3000(){
        double valor = this.salario;
        double imposto = 1000*0.08;
        double dife = valor - 3000;
        imposto += dife *0.18;
        return imposto;
    }
    public Double CalculaSalario2000(){
        double valor = this.salario;
        double dife = valor - 2000;
        double imposto = dife * 0.08;
        return imposto;
    }
}
