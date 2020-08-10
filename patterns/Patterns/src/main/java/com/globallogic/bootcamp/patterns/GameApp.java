package com.globallogic.bootcamp.patterns;

public class GameApp {

	public static void main(String[] args) {

		Game g1 = new Game();
		g1.title = "Resident Evil";

		Playstation p1 = new Playstation(g1);
		System.out.println(p1.askMyGame());

		Game g2 = new Game();
		g2.title = "Brawlhalla";

		p1.setVideogame(g2);

		System.out.println(p1.askMyGame());

		p1.setVideogame(null);

		System.out.println(p1.askMyGame());

	}

}
