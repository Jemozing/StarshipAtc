package com.visors.games;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.visors.games.view.GameScreen;


public class Main extends Game {

	private Screen gameScreen;

	@Override
	public void create() {
		gameScreen = new GameScreen();
		setScreen(gameScreen);
	}
}
