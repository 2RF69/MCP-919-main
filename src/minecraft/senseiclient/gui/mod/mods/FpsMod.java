package senseiclient.gui.mod.mods;


import senseiclient.gui.mod.HudMod;
import senseiclient.util.font.FontUtil;

public class FpsMod extends HudMod {
	

	public FpsMod() {
		super("FPS", 5, 30);
		
	}
	
	@Override
	public void draw() {
		
		fr.drawStringWithShadow("[" + mc.getDebugFPS() + " FPS]", getX(), getY(), -1);
		super.draw();
	}
	

		
	public int getWidth() {
		return fr.getStringWidth("FPS : " + mc.getDebugFPS());
	}
	
	@Override
	public int getHeight() {
		return fr.FONT_HEIGHT;
	}
	
	

}