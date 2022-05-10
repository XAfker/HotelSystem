package GUI2_PB_S25493;

import java.util.ArrayList;

public class Koszyk {

    public ArrayList<Pokoj> pokoje = new ArrayList<>();

    public Koszyk(Klient k){
    }

    @Override
    public String toString(){
        pokoje.forEach(p -> System.out.println(p));
        return "";
    }

}
