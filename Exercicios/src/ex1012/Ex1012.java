package ex1012;
import java.util.Scanner;
public class Ex1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circulo c1 = new Circulo();
        Retangulo r1 = new Retangulo();
        Triangulo t1 = new Triangulo();
        Trapezio tr1 = new Trapezio();
        Quadrado q1 = new Quadrado();
        
        
        for(;;){
            for(int i = 0; i < 20; i++)
            {
                System.out.println("");
            }
            System.out.printf("             Menu\n");
            System.out.printf("1 - Calcular area do circulo\n");
            System.out.printf("2 - Calcular area do Retangulo\n");
            System.out.printf("3 - Calcular area do triangulo\n");
            System.out.printf("4 - Calcular area do trapezio\n");
            System.out.printf("5 - Calcular area do trapezio\n");
            System.out.printf("6 - Finalizar\n");
            System.out.println("Resposta: ");
            int menu = scan.nextInt();
                    
            
            switch(menu){
                case 1:
                    System.out.printf("Informe o raio: ");
                    c1.setRaio(scan.nextDouble());
                    System.out.printf("Area do circulo = %.2f\n",c1.AreaCirculo());
                    System.out.printf("Aperte qualquer tecla para continuar\n");
                    String pause = scan.next();
                    break;
                
                case 2:
                    System.out.printf("Informe o primeiro lado: ");
                    r1.setLado1(scan.nextDouble());
                    System.out.printf("Informe o segundo lado: ");
                    r1.setLado2(scan.nextDouble());
                    System.out.printf("Area do Retangulo = %.2f\n",r1.AreaRetangulo());
                    System.out.printf("Aperte qualquer tecla para continuar\n");
                    pause = scan.next();
                    break;
                    
                case 3:
                    System.out.printf("Informe a base: ");
                    t1.setBase(scan.nextDouble());
                    System.out.printf("Informe a altura: ");
                    t1.setAltura(scan.nextDouble());
                    System.out.printf("Area do Triangulo = %.2f\n",t1.AreaTriangulo());
                    System.out.printf("Aperte qualquer tecla para continuar\n");
                    pause = scan.next();
                    break;
                    
                case 4:
                    System.out.printf("Informe a base: ");
                    tr1.setBase1(scan.nextDouble());
                    System.out.printf("Informe o lado: ");
                    tr1.setBase2(scan.nextDouble());
                    System.out.printf("Informe a altura: ");
                    tr1.setAltura(scan.nextDouble());
                    System.out.printf("Area do Trapezio = %.2\nf",tr1.AreaTrapezio());
                    System.out.printf("Aperte qualquer tecla para continuar\n");
                    pause = scan.next();
                    break;
                    
                case 5:
                    System.out.printf("Informe o lado: ");
                    q1.setLado(scan.nextDouble());
                    System.out.printf("Area do circulo = %.2f\n",c1.AreaCirculo());
                    System.out.printf("Aperte qualquer tecla para continuar\n");
                    pause = scan.next();
                    break;
                
                case 6:
                    System.exit(1);
                    break;
                    
                default:
                    System.out.printf("Valor incorreto, tente novamente.\n");
                    System.out.printf("Aperte qualquer tecla para continuar\n");
                    pause = scan.next();
                    
                    
                    break;
            }
        }
        //r1.setLado1(a);
        //r1.setLado2(b);
        /*System.out.printf("Informe o valor de A: ");
        double a = scan.nextDouble();
        System.out.printf("Informe o valor de B: ");
        double b = scan.nextDouble();
        System.out.printf("Informe o valor de C: ");
        double c = scan.nextDouble();
        c1.setRaio(c);
        System.out.printf("Area do circulo = %.3f\n",c1.AreaCirculo());
        r1.setLado1(a);
        r1.setLado2(b);
        System.out.printf("Area do Retangulo = %.3f\n",r1.AreaRetangulo());
        t1.setBase(b);
        t1.setAltura(c);
        System.out.printf("Area do Triangulo = %.3f\n",t1.AreaTriangulo());
        tr1.setBase1(a);
        tr1.setBase2(b);
        tr1.setAltura(c);
        System.out.printf("Area do Trapezio = %.3f\n",tr1.AreaTrapezio());
        q1.setLado(a);
        System.out.printf("Area do Quadrado = %.3f\n",q1.AreaQuadrado());
                
         */
    }  
}
