package hu.hazazs.elte.being;

import hu.hazazs.elte.exception.TooMuchWaterException;

public abstract class Being implements BeingInterface {

	private final String name;
	private int water;
	private boolean alive = true;
	private int distance = 0;

	Being(String name, int water, int maximumWater) {
		if (water > maximumWater) {
			throw new TooMuchWaterException("The initial water is more than the maximum water!");
		}
		this.name = name;
		this.water = water;
	}

	public String getName() {
		return name;
	}

	public boolean isAlive() {
		return alive;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public void drinkAndMove(int water, int distance) {
		if (water > this.water) {
			alive = false;
		} else {
			this.water -= water;
			this.distance += distance;
		}
	}

	public abstract void sunny();

	public abstract void cloudy();

	public abstract void rainy();

}