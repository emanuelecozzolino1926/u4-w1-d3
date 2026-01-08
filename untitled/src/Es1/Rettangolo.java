package Es1;

public class Rettangolo {
    public double altezza;
    public double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double perimetro(){
        return  2 * (altezza + larghezza);
    }

    public double area(){
        return altezza * larghezza;
    }

    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                ", area=" + area() +
                ", perimetro=" + perimetro() +
                '}';
    }
}

