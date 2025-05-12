package CompositionChallenge;

public class MainComp {
    public static void main(String[] args) {
        Bedroom dukesBedroom = new Bedroom("king", 6);
        Kitchen dukesKitchen = new Kitchen("stereo", 5);
        LivingRoom dukesLivingRoom = new LivingRoom(45, "samsung");
        //this is composition
        House dukesHouse = new House(dukesBedroom, dukesKitchen, dukesLivingRoom);
        dukesHouse.buildMyHouse(dukesBedroom, dukesKitchen, dukesLivingRoom);

    }
}
