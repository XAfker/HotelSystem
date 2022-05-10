package GUI2_PB_S25493;
import static GUI2_PB_S25493.Cennik.cennik;

public class Klient {

    String name;
    protected int declaratedAmount;
    ListaZyczen tenKlientLista;
    Koszyk tenKoszyk;

    public Klient(String name, int declaratedAmount) {
        this.name = name;
        this.declaratedAmount = declaratedAmount;
        this.tenKlientLista = new ListaZyczen(this);
        this.tenKoszyk = new Koszyk(this);
    }


    public void przepakuj(Koszyk cartKlient) {
        for (int i = 0; i < cennik.size(); i++) {
            for (int j = 0; j < tenKlientLista.listaPokoi.size(); j++) {
                if (cennik.get(i).name == tenKlientLista.listaPokoi.get(j).name && cennik.get(i).type == tenKlientLista.listaPokoi.get(j).type && cennik.get(i).price > 0) {
                    cartKlient.pokoje.add(tenKlientLista.listaPokoi.get(j));
                    tenKlientLista.listaPokoi.get(j).setPrice(cennik.get(i).price);
                    tenKlientLista.listaPokoi.remove(tenKlientLista.listaPokoi.get(j));
                }
            }
        }
    }

    public void zaplac(String type) {
        int fee = 0;
        int help = declaratedAmount;
        if(type.equals("przelew")){
            fee = 5;
        }
         help -= fee;

        for (int i = 0; i < tenKoszyk.pokoje.size(); i++) {
            if(help > 0){
                help -= (tenKoszyk.pokoje.get(i).price * tenKoszyk.pokoje.get(i).howLong);
                tenKoszyk.pokoje.remove(tenKoszyk.pokoje.get(i));
            }
        }
        declaratedAmount = help;
    }

    public void dodaj(Pokoj p){
        tenKlientLista.listaPokoi.add(p);
    }

    public ListaZyczen pobierzListeZyczen() {
        return tenKlientLista;
    }

    public int pobierzPortfel() {
        return this.declaratedAmount;

    }


    public int pobierzKoszyk() {
        int res = 0;

        for (Pokoj p : this.tenKoszyk.pokoje) {
            res += (p.price * p.howLong);
        }
        return res;
    }

    public int getDeclaratedAmount(){
        return this.declaratedAmount;
    }

}
