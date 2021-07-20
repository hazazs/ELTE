package hu.hazazs.elte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hu.hazazs.elte.being.Being;
import hu.hazazs.elte.being.SandWalker;
import hu.hazazs.elte.being.Sponge;
import hu.hazazs.elte.being.Stepper;
import hu.hazazs.elte.exception.NoSuchBeingTypeException;

final class Game {

	private final Scanner scanner;
	private final List<Being> beings;

	Game(Scanner scanner) {
		this.scanner = scanner;
		this.beings = getBeings();
	}

	private List<Being> getBeings() {
		int numberOfBeings = scanner.nextInt();
		List<Being> beings = new ArrayList<>(numberOfBeings);
		for (int i = 0; i < numberOfBeings; i++) {
			String name = scanner.next();
			String type = scanner.next();
			int initialWater = scanner.nextInt();
			beings.add(switch (type) {
			case "h" -> new SandWalker(name, initialWater);
			case "l" -> new Stepper(name, initialWater);
			case "s" -> new Sponge(name, initialWater);
			default -> throw new NoSuchBeingTypeException("Invalid type of Being!");
			});
		}
		scanner.nextLine();
		return beings;
	}

	void drinkAndMove() {
		String days = scanner.nextLine();
		for (int i = 0; i < days.length(); i++) {
			for (Being being : beings) {
				if (being.isAlive()) {
					switch (days.charAt(i)) {
					case 'n' -> being.sunny();
					case 'f' -> being.cloudy();
					case 'e' -> being.rainy();
					}
				}
			}
		}
	}

	Being getWinner() {
		Being winner = null;
		int winnerDistance = Integer.MIN_VALUE;
		for (Being being : beings) {
			if (being.isAlive() && being.getDistance() > winnerDistance) {
				winner = being;
				winnerDistance = being.getDistance();
			}
		}
		return winner;
	}

}