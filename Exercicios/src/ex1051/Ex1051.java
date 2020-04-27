package ex1051;
import java.util.Scanner;

public class Ex1051 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Habitante h1 = new Habitante();
        System.out.printf("Informe o salário: ");
        h1.setSalario(scan.nextDouble());
        
        if(h1.getSalario() > 4500){
            System.out.printf("Valor a ser pago = %.2f ",h1.CalculaSalario4500());
        }else if(h1.getSalario() > 3000){
            System.out.printf("Valor a ser pago = %.2f ",h1.CalculaSalario3000());
        }else if(h1.getSalario() > 2000){
            System.out.printf("Valor a ser pago = %.2f ",h1.CalculaSalario2000());
        }else{
            System.out.printf("Voce está isento.");
        }
        
    }  
}
