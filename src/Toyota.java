public class Toyota extends Vehicle {
    int door;
    String color;

    public Toyota(String color, int door) {
        this.color = color;
        this.door = door;

    }

    @Override
    public void speedUp() {
        System.out.println("this is also valled from the toyota class");
    }
}
