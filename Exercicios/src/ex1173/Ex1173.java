package ex1173;
import java.util.Scanner;
public class Ex1173 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vetor vet1 = new Vetor();
        int[]num = new int[10];
        
        System.out.printf("Digite um número entre 0  e 50: ");
        vet1.setNum(scan.nextInt());
        
        for(int x = 0;x<10;x++){
            num[x] = vet1.getNum();
            System.out.printf("%d\n",vet1.Duplica());
            vet1.setNum(vet1.Duplica());
        }
    }
}
