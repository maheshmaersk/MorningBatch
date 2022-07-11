package test;

public class Audi extends FourWheeler {
    public static void main(String[] args) {
        FourWheeler obj = new Audi();
        obj.brake();
        obj.engineType();
    }

    public void engineType() {
        System.out.println("Audi Has Diesel Engine");
    }

    public void advancedMechanism() {
        System.out.println("Audi Has Mechanisim Engine");
    }
}
