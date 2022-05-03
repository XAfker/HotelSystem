package GUI2_PB_S25493;
import static GUI2_PB_S25493.Cennik.cennik;

public class Klient extends ListaZyczen{

    private String name;
    private int declaratedAmount;

    public Klient(String name, int declaratedAmount) {
        this.name = name;
        this.declaratedAmount = declaratedAmount;
    }

    public void przepakuj(Koszyk cartKlient) {
        for (Cena cena : cennik) {
            for (Pokoj pokoj : listaZyczen) {
                if (cena.name == pokoj.name || cena.type == pokoj.type || cena.price != 0) {
                    cartKlient.pokoje.add(pokoj);
                    listaZyczen.remove(pokoj);
                }
            }
        }
    }

    public void zaplac(String type) {
    }

    public void dodaj(Pokoj p){
        listaZyczen.add(p);
    }

    public ListaZyczen pobierzListeZyczen() {
        return (ListaZyczen) listaZyczen;
    }

    public int pobierzPortfel() {
        return 0;

    }

    public int pobierzKoszyk() {
        return 0;
    }
}
