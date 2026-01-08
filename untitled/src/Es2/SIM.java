package Es2;

public class SIM {

    private String numeroTelefono;
    private double credito;
    private Chiamata[] ultimeChiamate;
    private int index;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new Chiamata[5];
        this.index = 0;
    }

    public void aggiungiChiamata(Chiamata c) {
        if (index < 5) {
            ultimeChiamate[index] = c;
            index++;
        } else {
            for (int i = 0; i < 4; i++) {
                ultimeChiamate[i] = ultimeChiamate[i + 1];
            }
            ultimeChiamate[4] = c;
        }
    }

    public void printDatiSIM() {
        System.out.println("Numero telefono: " + numeroTelefono);
        System.out.println("Credito: " + credito + " €");
        System.out.println("Ultime chiamate:");

        for (int i = 0; i < ultimeChiamate.length; i++) {
            if (ultimeChiamate[i] != null) {
                System.out.println(ultimeChiamate[i]);
            }
        }
    }
}
