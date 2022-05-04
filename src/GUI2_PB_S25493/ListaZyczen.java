package GUI2_PB_S25493;

import java.util.ArrayList;

public class ListaZyczen extends ArrayList<Pokoj> {

    protected static ListaZyczen listaZyczen = new ListaZyczen();

    @Override
    public String toString() {
        for (Pokoj pokoj : listaZyczen) {
            System.out.println(pokoj.name + " | typ : " +pokoj.type);
        }
        return "";
    }
}
