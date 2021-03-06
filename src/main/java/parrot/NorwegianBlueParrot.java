package parrot;

public class NorwegianBlueParrot extends Parrot {

    private static final int NAILED_SPEED = 0;
    private static final double MAX_SPEED = 24.0;
    protected double voltage;
    protected boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        if (isNailed) {
            return NAILED_SPEED;
        }
        return Math.min(getSpeedWithVoltage(), MAX_SPEED);
    }

    private double getSpeedWithVoltage() {
        return voltage * getBaseSpeed();
    }
}