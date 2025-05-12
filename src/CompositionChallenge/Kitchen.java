package CompositionChallenge;

public class Kitchen {
    private String typeOfStove;
    private int numberOfChairs;

    public Kitchen(String typeOfStove, int numberOfChairs) {
        this.typeOfStove = typeOfStove;
        this.numberOfChairs = numberOfChairs;
    }

    public String getTypeOfStove() {
        return typeOfStove;
    }

    public void setTypeOfStove(String typeOfStove) {
        this.typeOfStove = typeOfStove;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }
}
