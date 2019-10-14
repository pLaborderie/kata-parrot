package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
        super(ParrotTypeEnum.EUROPEAN);
    }

    public double getSpeed() {
        return getBaseSpeed();
    }
}