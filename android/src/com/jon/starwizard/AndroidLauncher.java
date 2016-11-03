package com.jon.starwizard;

import android.os.Bundle;
import android.provider.SyncStateContract;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.jon.starwizard.Game.StarWizardGame;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		new LwjglApplication(new MartianRun(), config);

		initialize(new StarWizardGame(), config);
	}
}
