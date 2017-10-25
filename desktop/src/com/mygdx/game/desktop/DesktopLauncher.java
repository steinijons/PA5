package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.LabFirst3DGame;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
	
		config.title = "Lab1"; // or whatever you like
		config.width = 1024;  //experiment with
		config.height = 768;  //the window size
		
		new LwjglApplication(new MyGdxGame(), config);
		//new LwjglApplication(new LabFirst3DGame(), config);
	}
}
