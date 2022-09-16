package senseiclient.gui.mod;

import java.util.ArrayList;
import senseiclient.gui.mod.HudMod;
import senseiclient.gui.mod.mods.FpsMod;
import senseiclient.gui.mod.mods.KeystrokesMod;
import senseiclient.gui.mod.mods.TestMod;

public class HudManager {
	
	public ArrayList<HudMod> hudMods = new ArrayList<>();
	
	public TestMod testMod;
	public KeystrokesMod keystrokes;
	public FpsMod fpsMod;
	
	public HudManager() {
		hudMods.add(testMod = new TestMod());
		hudMods.add(keystrokes = new KeystrokesMod());
		hudMods.add(fpsMod = new FpsMod());
	}
	
	public void renderMods() {
		for(HudMod m : hudMods) {
			if(m.isEnabled()) {
				m.draw();
			}
		}
	}

}
