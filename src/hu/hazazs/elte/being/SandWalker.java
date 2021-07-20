package hu.hazazs.elte.being;

public final class SandWalker extends Being {

	public SandWalker(String name, int initialWater) {
		super(name, initialWater, 8);
	}

	@Override
	public void sunny() {
		drinkAndMove(0, 8);
	}

	@Override
	public void cloudy() {
		drinkAndMove(1, 5);
	}

	@Override
	public void rainy() {
		drinkAndMove(1, 5);
	}

}