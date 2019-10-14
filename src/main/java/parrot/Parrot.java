package parrot;

public class Parrot {

	private ParrotTypeEnum type;
	protected int numberOfCoconuts;
	private double voltage;
    private boolean isNailed;
    
    public Parrot() {
        this.numberOfCoconuts = 0;
    }

	public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = _type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
            throw new RuntimeException("Should be unreachable");
		case AFRICAN:
            throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	protected double getLoadFactor() {
		return 9.0;
	}

	protected double getBaseSpeed() {
		return 12.0;
	}

}
