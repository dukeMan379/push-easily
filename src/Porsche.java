public class Porsche extends Vehicle {

    int exhaustPipe;
    String modelName;


    public Porsche(int exhaustPipe, String modelName) {
        this.exhaustPipe = exhaustPipe;
        this.modelName = modelName;
    }

    @Override
    public void speedUp() {
        System.out.println("this is been called from the porsche class");
    }
}





