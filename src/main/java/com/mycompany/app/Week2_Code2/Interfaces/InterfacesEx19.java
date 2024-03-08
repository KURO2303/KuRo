package com.mycompany.app.Week2_Code2.Interfaces;

import java.util.*;


interface Games {
	void play();
}

interface GamesFactory {
	Games getGames();
}

class CoinToss implements Games {
	Random rand = new Random();
	public void play() { 
		println("Toss Coin: ");
		switch(rand.nextInt(2)) {
			case 0 : println("Heads"); return;
			case 1 : println("Tails"); return;
			default: println("OnEdge"); return;
		} 
	}
	private void println(String string) {
	}
}

class CoinTossFactory implements GamesFactory {
	private void println(String string) {
	}
	public Games getGames() {
		return new CoinToss();
	}
}

class DiceThrow implements Games {
	Random rand = new Random();
	private void println(String string) {
	}
	public void play() { 
		println("Throw Dice: " + (rand.nextInt(6) + 1));		
	}
}

class DiceThrowFactory implements GamesFactory {
	private void println(String string) {
	}
	public Games getGames() {
		return new DiceThrow();
	}
}


public class InterfacesEx19 {
	public static void playGame(GamesFactory factory) {
		Games g = factory.getGames();
		g.play();
	}
	public static void main(String [] args) {
		playGame(new CoinTossFactory());
		playGame(new DiceThrowFactory());			
	}
}