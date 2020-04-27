package ex1117;
import java.util.Scanner;

public class Ex1117 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Scanner scan = new Scanner(System.in);
        System.out.printf("nota 1: ");
        a1.setNota1(scan.nextDouble());
        while(a1.nota1 < 0 || a1.nota1 > 10){
            System.out.printf("Informe uma nota válida: ");
            a1.setNota1(scan.nextDouble());
        }
        System.out.printf("nota 2: ");
        a1.setNota2(scan.nextDouble());
        while(a1.nota2 < 0 || a1.nota2 > 10){
            System.out.printf("Informe uma nota válida: ");
            a1.setNota1(scan.nextDouble());
        }
        System.out.printf("Média: %.2f\n",a1.CalculaMedia());
    }
}
