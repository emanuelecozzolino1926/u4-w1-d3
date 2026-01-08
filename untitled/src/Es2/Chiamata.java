package Es2;

public class Chiamata {
    private String numeroChiamato;
    private int durataMinuti;

    public Chiamata(String numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }

    public String toString() {
        return "Chiamata{" +
                "numeroChiamato='" + numeroChiamato + '\'' +
                ", durataMinuti=" + durataMinuti +
                '}';
    }
}
