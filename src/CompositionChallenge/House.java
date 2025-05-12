package CompositionChallenge;

public class House {
    Bedroom bedroom;
    Kitchen kitchen;
    LivingRoom livingroom;

    public House(Bedroom bedroom, Kitchen kitchen, LivingRoom livingroom) {
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.livingroom = livingroom;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public LivingRoom getLivingroom() {
        return livingroom;
    }

    public void setLivingroom(LivingRoom livingroom) {
        this.livingroom = livingroom;
    }

    void buildMyHouse(Bedroom bedroom, Kitchen kitchen, LivingRoom livingroom) {
        System.out.println("your new house has a bedroom size of:" + bedroom.getBedSize());
        System.out.println("your new house has a kitchen of: " + kitchen.getTypeOfStove()+ "stove");
        System.out.println("your new house has livingroom of tv size of:" + livingroom.getSizeOfTv());
    }
}