public class Maths {
    private int a;
    private int b;

    public Maths(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int mult(int a, int b){
        return a*b;
    }
    public int suma(int a, int b){
        return a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
