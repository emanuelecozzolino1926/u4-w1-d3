import Es1.Rettangolo;
import Es2.Chiamata;
import Es2.SIM;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5,6);
        Rettangolo r2 = new Rettangolo(10,13);

        System.out.println("1° " +  r1);
        System.out.println("2° " + r2);

        SIM sim = new SIM("3331234567");

        sim.aggiungiChiamata(new Chiamata("3201111111", 3));
        sim.aggiungiChiamata(new Chiamata("3402222222", 5));
        sim.aggiungiChiamata(new Chiamata("3503333333", 2));

        sim.printDatiSIM();
    }
}
