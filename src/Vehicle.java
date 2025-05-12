public class Vehicle {
    int door;
    String color;

    public Vehicle(){
        this.door = 4;
        this.color = "blue";

    }

    public Vehicle(String modelName, int exhaustPipe) {
        this.door = door;
        this.color = color;
    }
    public void speedUp(){
        System.out.println("this method is called from the parent");

    }
}
