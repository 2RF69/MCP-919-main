package senseiclient;

import org.lwjgl.opengl.Display;

import senseiclient.gui.mod.HudManager;

public class Client {
	
	public String name = "SENSEI CLIENT", version = "1.1";
	public static Client INSTANCE = new Client();
	
	public HudManager hudManager;
	
	public void startup() {
		Display.setTitle(name + " | " + version);
		hudManager = new HudManager();
	}
	
	public void shutdown() {
		
	}

	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
			

}
