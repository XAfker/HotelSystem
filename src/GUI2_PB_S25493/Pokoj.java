package GUI2_PB_S25493;

public abstract class Pokoj {

    protected String name;
    protected String type;
    protected int howLong;
    protected int price;
    protected boolean breakfast;


    public Pokoj(String type, int howLong, boolean breakfast){
        this.type = type;
        this.howLong = howLong;
        this.breakfast = breakfast;
    }

    @Override
    public String toString(){
        String res = (this.name +", typ: " +this.type +", na ile: " +this.howLong);
        if(breakfast)
            res += (", sniadanie? tak");
        else
            res += (", sniadanie? nie");

        if(this.price != 0)
        res += (", cena: " +this.price);

        return res;
    }

    public void setPrice(int price){
        this.price = price;
    }

}

class Jedynka extends Pokoj{

    public Jedynka(String type, int howLong, boolean breakfast) {
        super(type, howLong, breakfast);
        this.name = "jedynka";
    }


}

class Dwojka extends Pokoj{

    public Dwojka(String type, int howLong, boolean breakfast) {
        super(type, howLong, breakfast);
        this.name = "dwojka";
    }

}

class Trojka extends Pokoj{

    public Trojka(String type, int howLong, boolean breakfast) {
        super(type, howLong, breakfast);
        this.name = "trojka";
    }
}

