package aulatriangulo;

import java.util.Scanner;

public class AulaTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Instancia o objeto
        Triangulo t1 = new Triangulo();
        
        // Solicita e lê o cateto 1
        System.out.print("Digite o valor do cateto 1: ");
        double cateto1 = sc.nextDouble();
        t1.setC1(cateto1);
        
        // Solicita e lê o cateto 2
        System.out.print("Digite o valor do cateto 2: ");
        double cateto2 = sc.nextDouble();
        t1.setC2(cateto2);
        
        // Realiza os cálculos internos
        t1.calculahipotenusa();
        t1.calculaArea();
        
        // Exibe os resultados na tela
        System.out.println("Hipotenusa: " + t1.getH());
        System.out.println("Área: " + t1.getArea());
        
        sc.close();
    }
}
