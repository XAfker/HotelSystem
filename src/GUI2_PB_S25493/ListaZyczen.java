package GUI2_PB_S25493;

import java.util.ArrayList;

public class ListaZyczen{

    private Klient klient;
    public ArrayList<Pokoj> listaPokoi = new ArrayList<>();
    public ListaZyczen(Klient klient){
        this.klient = klient;
    }

    @Override
    public String toString(){
        String res = klient.name + "\n";
        for (Pokoj pokoj : listaPokoi) {
            res += pokoj + "\n";
        }
        return res;
    }
}
