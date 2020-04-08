public class RaceCar extends Car{
    private int topSpeed;

    public RaceCar(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void airBags() {
        super.airBags();
        rollCage();
    }

    private void rollCage() {
        return;
    }

}
