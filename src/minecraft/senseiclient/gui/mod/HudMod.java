package senseiclient.gui.mod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;


public class HudMod {
	
	
	public Minecraft mc = Minecraft.getMinecraft();
	
	public FontRenderer fr = mc.fontRendererObj;
	
	public String name;
	
	public int x,y;
	
	public boolean enabled;
		
    
    

	public HudMod(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.enabled = true;
	}







	public HudMod(String string, int i, int j, String string2) {
		// TODO Auto-generated constructor stub
	}







	public int getWidth() {
    	return 50;
    }
    
    public int getHeight( ) {
    	return 50;
    }
    
    public void draw() {
    	
    }
    
    public int getX() {
    	return this.x;
    }
    
    public int getY() {
    	return this.y;
    }
    
    public void setEnabled(boolean enabled) {
    	this.enabled = enabled;
    }
    
    
    public void toggle() {
    	this.setEnabled(!enabled);
    }
    
    public boolean isEnabled() {
    	return enabled;
    }







	public void renderDummy(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
