package ex1040;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno a1 = new Aluno();
        System.out.printf("Nome do aluno: ");
        a1.setNome(scan.nextLine());
        System.out.printf("Materia: ");
        a1.setMateria(scan.nextLine());
        System.out.printf("Primeira nota: ");
        a1.setNota1(scan.nextDouble());
        System.out.printf("Segunda nota: ");
        a1.setNota2(scan.nextDouble());
        System.out.printf("Terceira nota: ");
        a1.setNota3(scan.nextDouble());
        System.out.printf("Quarta nota: ");
        a1.setNota4(scan.nextDouble());
        if(a1.CalculaNota()>=5 && a1.CalculaNota()<=6.9){
            System.out.printf("Digite a nota do exame: ");
            a1.setNotaexame(scan.nextDouble());
            for(int i = 0; i < 20; i++)
            {
                System.out.println("");
            }
            System.out.printf("Nome: %s\n",a1.getNome());
            System.out.printf("Matéria: %s\n",a1.getMateria());
            System.out.printf("Aluno %s está em exame \n",a1.getNome());
            System.out.printf("Nota do exame: %.2f\n",a1.getNotaexame());
            if(a1.CalculaExame()>=5){
                System.out.printf("Aluno aprovado\n");
                System.out.printf("Média final: %.2f\n",a1.CalculaExame());
            }else{
                System.out.printf("Aluno Reprovado\n");
                System.out.printf("Média final: %.2f\n",a1.CalculaExame());
            }
        }else{
            for(int i = 0; i < 20; i++)
            {
                System.out.println("");
            }
            System.out.printf("Nome: %s\n",a1.getNome());
            System.out.printf("Matéria: %s\n",a1.getMateria());
            System.out.printf("Média: %.2f\n",a1.CalculaNota());
            if(a1.CalculaNota()>=7){
                System.out.printf("Aluno aprovado\n");
            }else{
                System.out.printf("Aluno reprovado\n");
            }
        }
    } 
}
