package parrot;

public class AfricanParrot extends Parrot {
    private static final int MIN_SPEED = 0;
    private static final double LOAD_FACTOR = 9.0;
    protected int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public double getSpeed() {
        return Math.max(MIN_SPEED, getSpeedWithCoconuts());
    }

    private double getSpeedWithCoconuts() {
        return getBaseSpeed() - LOAD_FACTOR * numberOfCoconuts;
    }
}