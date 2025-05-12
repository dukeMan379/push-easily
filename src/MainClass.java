public class MainClass {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.speedUp();

        Porsche myPorsche = new Porsche(4,"Cayenne");
        myPorsche.speedUp();

        Toyota myToyota = new Toyota("red", 4);
        myToyota.speedUp();

    }
}
