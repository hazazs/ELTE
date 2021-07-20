package hu.hazazs.elte.being;

public final class Stepper extends Being {

	public Stepper(String name, int initialWater) {
		super(name, initialWater, 12);
	}

	@Override
	public void sunny() {
		drinkAndMove(1, 5);
	}

	@Override
	public void cloudy() {
		drinkAndMove(0, 9);
	}

	@Override
	public void rainy() {
		drinkAndMove(1, 5);
	}

}