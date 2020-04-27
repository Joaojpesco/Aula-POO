package ex1040;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double notaexame;
    private String materia;

    public Aluno(){
        
    }

    public double getNotaexame() {
        return notaexame;
    }

    public void setNotaexame(double notaexame) {
        this.notaexame = notaexame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public double CalculaNota(){
        double media;
        media = ((this.nota1*2) + (this.nota2*3) + (this.nota3*4) + (this.nota4*1))/10;
        return media;
    }
    public double CalculaExame(){
        double mediaexame;
        
        mediaexame = (CalculaNota() + this.notaexame)/2;
        
        return mediaexame;
    }
}
