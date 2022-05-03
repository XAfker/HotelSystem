package GUI2_PB_S25493;

public abstract class Pokoj {

    protected String name;
    protected String type;
    protected int howLong;
    protected boolean breakfast;


    public Pokoj(String type, int howLong, boolean breakfast){
        this.type = type;
        this.howLong = howLong;
        this.breakfast = breakfast;
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

