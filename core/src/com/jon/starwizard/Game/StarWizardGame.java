package com.jon.starwizard.Game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jon.starwizard.Screen.MainScreen;

public class StarWizardGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		setScreen(new MainScreen());
	}

	@Override
	public void render () {
	}
	
	@Override
	public void dispose () {
	}
}
