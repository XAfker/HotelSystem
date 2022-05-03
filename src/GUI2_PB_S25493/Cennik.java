package GUI2_PB_S25493;

import java.util.ArrayList;

public class Cennik extends ArrayList<Cena>{

    protected static ArrayList<Cena> cennik = new ArrayList<Cena>();

    public static Cennik pobierzCennik() {
        return (Cennik) cennik;
    }

//    public Cennik(String name, String type, int price, int breakfastPrice){
//        this.name = name;
//        this.type = type;
//        this.price = price;
//        this.breakfastPrice = breakfastPrice;
//    }

    public void dodaj(String name, String type, int price, int breakfastPrice) {
        cennik.add((new Cena(name,type,price,breakfastPrice)));
    }
}

class Cena{
    protected String name;
    protected String type;
    protected int price;
    protected int breakfastPrice;

    public Cena(String name, String type, int price, int breakfastPrice){
        this.name = name;
        this.type = type;
        this.price = price;
        this.breakfastPrice = breakfastPrice;
    }
}
