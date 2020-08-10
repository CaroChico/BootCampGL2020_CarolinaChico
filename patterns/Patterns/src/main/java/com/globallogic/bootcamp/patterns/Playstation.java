package com.globallogic.bootcamp.patterns;

public class Playstation {

	public Game videogame;

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}

	public Playstation(Game videogame) {

		this.videogame = videogame;

	}

	public String askMyGame() {

		if (videogame == null) {

			return "Estoy vacio";

		}

		return "El videojuego que estoy corriendo es: " + videogame.title;

	}

}
