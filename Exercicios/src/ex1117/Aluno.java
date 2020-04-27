package ex1117;

public class Aluno {
    double nota1;
    double nota2;
    
    public Aluno(){
        
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double CalculaMedia(){
        double media;
        media = (this.nota1 + this.nota2) / 2;
        return media;
    }
}
