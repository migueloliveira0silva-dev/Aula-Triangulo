package aulatriangulo;

public class Triangulo {
    private double h;
    private double c1; 
    private double c2;
    private double area;
    
    public Triangulo(){
        c1 = 0;
        c2 = 0;
        h = 0;
        area = 0;
    }
    
    public Triangulo(double h, double c1, double c2, double area){
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
        this.area = area;
    }
    
    public double calculaArea(){
        this.area = (this.c1 * this.c2) / 2.0;
        return area;
    }
    
    public double calculahipotenusa(){
        double quadrado1 = Math.pow(c1, 2);
        double quadrado2 = Math.pow(c2, 2);
        double soma = quadrado1 + quadrado2;
        
        this.h = Math.sqrt(soma);
        return h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
