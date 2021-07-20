package hu.hazazs.elte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import hu.hazazs.elte.being.Being;

class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new File("src\\ELTE.txt"))) {
			Game game = new Game(scanner);
			game.drinkAndMove();
			Being winner = game.getWinner();
			System.out.println(winner == null ? "No Winner, every beings have been died or there are no beings at all!"
					: String.format("The winner is %s", winner.getName()));
		} catch (FileNotFoundException x) {
			System.out.println(x.getMessage());
		}
	}

}