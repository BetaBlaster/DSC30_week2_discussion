public class Sedan extends Car implements StreetOkay{
    private int doors;
    private String dir;


    public Sedan(int doors) {
        this.doors = doors; // using 'this' refers to the object instance, NOT PARAMATER
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public void turnSignal(String dir) {
        if (dir.toLowerCase().equals("left") || dir.toLowerCase().equals("right")) {
            this.dir = dir;
        }
    }

    @Override
    public void airbags() {
        super.airBags();
    }
}
