package CompositionChallenge;

public class Bedroom {
    private String bedSize;
    private int numberOfPillows;

    public Bedroom(String bedSize, int numberOfPillows) {
        this.bedSize = bedSize;
        this.numberOfPillows = numberOfPillows;
    }

    public String getBedSize() {
        return bedSize;
    }

    public void setBedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }

    public void setNumberOfPillows(int numberOfPillows) {
        this.numberOfPillows = numberOfPillows;
    }
}

