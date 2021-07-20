package hu.hazazs.elte.being;

public final class Sponge extends Being {

	public Sponge(String name, int initialWater) {
		super(name, initialWater, 20);
	}

	@Override
	public void sunny() {
		drinkAndMove(1, 5);
	}

	@Override
	public void cloudy() {
		drinkAndMove(1, 5);
	}

	@Override
	public void rainy() {
		drinkAndMove(0, 7);
	}

}