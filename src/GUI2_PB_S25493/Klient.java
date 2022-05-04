package GUI2_PB_S25493;
import static GUI2_PB_S25493.Cennik.cennik;

public class Klient extends ListaZyczen{

    private String name;
    private int declaratedAmount;
    private Koszyk customerBasket;

    public Klient(String name, int declaratedAmount) {
        this.name = name;
        this.declaratedAmount = declaratedAmount;
    }

    public void przepakuj(Koszyk cartKlient) {
        for (int i = 0; i < cennik.size(); i++) {
            for (int j = 0; j < listaZyczen.size(); j++) {
                if (cennik.get(i).name == listaZyczen.get(j).name || cennik.get(i).type == listaZyczen.get(j).type || cennik.get(i).price != 0) {
                    cartKlient.add(listaZyczen.get(j));
                    listaZyczen.remove(listaZyczen.get(j));
                }
            }
        }
    }

    public void zaplac(String type) {
        switch (type){
            case "karta":
                break;
            case "przelew":
                break;

            default:
                System.out.println("that's not a valuable option");
        }
    }

    public void dodaj(Pokoj p){
        listaZyczen.add(p);
    }

    public ListaZyczen pobierzListeZyczen() {
        return listaZyczen;
    }

    public int pobierzPortfel() {
        return 0;

    }

    public int pobierzKoszyk() {
        return 0;
    }
}
