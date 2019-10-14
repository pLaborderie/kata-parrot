package parrot;

public class Parrot {

	private ParrotTypeEnum type;

	public Parrot(ParrotTypeEnum _type) {
		this.type = _type;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
            throw new RuntimeException("Should be unreachable");
		case AFRICAN:
            throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
            throw new RuntimeException("Should be unreachable");
		}
		throw new RuntimeException("Should be unreachable");
	}

	protected double getBaseSpeed() {
		return 12.0;
	}

}
