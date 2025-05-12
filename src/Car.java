public class Car {
    //create a constructor
    Car(String color, int doors, int windows) {
        this.color = color;
        this.doors = doors;
        this.windows = windows;

    }
    String color;
    int doors;
    int windows;
    
    public int accelerate(){
        return 0;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }
}

