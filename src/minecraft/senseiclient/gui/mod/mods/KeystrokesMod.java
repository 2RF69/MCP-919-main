package senseiclient.gui.mod.mods;

import java.awt.Color;

import senseiclient.gui.mod.HudMod;
import senseiclient.util.font.FontUtil;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.settings.KeyBinding;

public class KeystrokesMod extends HudMod {

	public KeystrokesMod() {
		super("Keystrokes", 10, 90);
		
	}
	
	public static enum KeystrokesMode {
		
		
		WASD(Key.W, Key.A, Key.S, Key.D),
		WASD_MOUSE(Key.W, Key.A, Key.S, Key.D, Key.LMB, Key.RMB),
		WASD_JUMP(Key.W, Key.A, Key.S, Key.D, Key.Jump1, Key.Jump2),
		WASD_JUMP_MOUSE(Key.W, Key.A, Key.S, Key.D, Key.LMB, Key.RMB, Key.Jump2);
		
		private final Key[] keys;
		private int width,height;
		




		private KeystrokesMode(Key... KeysIn) {
			this.keys = KeysIn;
			
			for(Key key : keys) {
				this.width  = Math.max(this.width, key.getX() + key.getWidth());
				this.height  = Math.max(this.height, key.getY() + key.getHeight());
			}
			}
			
			
	
		
		private Key[] getKeys() {
			return keys;

		}
		
		
	}
	
	public static class Key {
		public static Minecraft mc = Minecraft.getMinecraft();
		
		private static final Key W = new Key("W", mc.gameSettings.keyBindForward, 21, 1, 18, 18);
		private static final Key A = new Key("A", mc.gameSettings.keyBindLeft, 1, 21, 18, 18);
		private static final Key S = new Key("S", mc.gameSettings.keyBindBack, 21, 21, 18, 18);
		private static final Key D = new Key("D", mc.gameSettings.keyBindRight, 41, 21, 18, 18);
		
		private static final Key LMB = new Key("LMB", mc.gameSettings.keyBindAttack, 1, 41, 28, 18);
		private static final Key RMB = new Key("RMB", mc.gameSettings.keyBindUseItem, 31, 41, 28, 18);
		
		private static final Key Jump1 = new Key("", mc.gameSettings.keyBindJump, 1, 41, 58, 18);
		private static final Key Jump2 = new Key("", mc.gameSettings.keyBindJump, 1, 61, 58, 18);
		
		private final String name;
		private final KeyBinding keyBind;
		private final int x,y,w,h;
		
		public Key(String name, KeyBinding keyBind, int x, int y, int w, int h) {
			this.name = name;
			this.keyBind = keyBind;
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
		
		public boolean isDown() {
			return keyBind.isKeyDown();
		}
		
		public int getHeight() {
			return h;

		
		}
		
		private int getWidth() {
			return w;

		}
		
		public String getName() {
			return name;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		
		
	}
	
	private KeystrokesMode mode = KeystrokesMode.WASD_JUMP_MOUSE;
	
	@Override
	public int getWidth() {
		return 58;
	}
	
	@Override
	public int getHeight() {
		return 18;
	}
	
	@Override
	public void draw() {
		GL11.glPushMatrix();
		
		for(Key key : mode.getKeys()) {
			
			int textWidth = fr.getStringWidth(key.getName());
			
			
			
			
			Gui.drawRect(getX() + key.getX(), getY() + key.getY(), getX() + key.getX() + key.getWidth(), getY() + key.getY() + key.getHeight(), key.isDown() ? new  Color(255, 255, 255, 102).getRGB() : new Color (0, 0, 0, 120).getRGB());
			
			fr.drawStringWithShadow(key.getName(), getX() + key.getX() + key.getWidth() / 2 - textWidth / 2, getY() + key.getY() + key.getHeight() / 2 - 4, key.isDown() ? new Color(0, 0, 0, 255).getRGB() : -1);
		}
		
		
		GL11.glPopMatrix();
		
	}
	
	public void RenderDummy(int mouseX, int mouseY) {
		GL11.glPushMatrix();
		
		for(Key key : mode.getKeys()) {
			
			int textWidth = fr.getStringWidth(key.getName());
			
			
			
			
			Gui.drawRect(getX() + key.getX(), getY() + key.getY(), getX() + key.getX() + key.getWidth(), getY() + key.getY() + key.getHeight(), key.isDown() ? new  Color(255, 255, 255, 102).getRGB() : new Color (0, 0, 0, 120).getRGB());
			
			fr.drawStringWithShadow(key.getName(), getX() + key.getX() + key.getWidth() / 2 - textWidth / 2, getY() + key.getY() + key.getHeight() / 2 - 4, key.isDown() ? new Color(0, 0, 0, 255).getRGB() : -1);
		}
		
		
		GL11.glPopMatrix();
		
	}



}
                


