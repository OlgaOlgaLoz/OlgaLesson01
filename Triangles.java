package triangle;

public class Triangles {
    private double a;
    private double b;
    private double c;

    public Triangles(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangles() {

    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }
     public double plo() {
        double p=(a+b+c)/2;
        double d = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return d;
     }
    @Override
    public String toString(){
         return "Площадь треугольника"+" a="+a+",b="+b+",c="+c+" : "+ plo()+" "+String.format("%.3f",plo());
    }

}
