package parrot;

public class NorwegianBlueParrot extends Parrot {

    private static final double MAX_SPEED = 24.0;
    protected double voltage;
    protected boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(ParrotTypeEnum.NORWEGIAN_BLUE);
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
        if (isNailed) {
            return 0;
        }
        return Math.min(getSpeedWithVoltage(), MAX_SPEED);
    }

    private double getSpeedWithVoltage() {
        return voltage * getBaseSpeed();
    }
}