package GUI2_PB_S25493;

import java.util.ArrayList;

public class ListaZyczen extends ArrayList<Pokoj> {

    protected ArrayList<Pokoj> listaZyczen = new ArrayList<Pokoj>();

    @Override
    public String toString() {
        for (Pokoj pokoj : listaZyczen) {
            System.out.println(pokoj);
        }
        return "";
    }
}
