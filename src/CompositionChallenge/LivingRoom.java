package CompositionChallenge;

public class LivingRoom {
    private int sizeOfTv;
    private String tvBrand;

    public LivingRoom(int sizeOfTv, String tvBrand) {
        this.sizeOfTv = sizeOfTv;
        this.tvBrand = tvBrand;
    }

    public int getSizeOfTv() {
        return sizeOfTv;
    }

    public void setSizeOfTv(int sizeOfTv) {
        this.sizeOfTv = sizeOfTv;
    }

    public String getTvBrand() {
        return tvBrand;
    }

    public void setTvBrand(String tvBrand) {
        this.tvBrand = tvBrand;
    }
}
