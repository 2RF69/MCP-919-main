package senseiclient.gui.clickgui;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import senseiclient.Client;

public class FeatherClickGUI extends GuiScreen {
	
	
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public void initGui() {
		this.buttonList.add(new GuiButton(1, 100,this.height /2, "WaterMarkMod | " + Client.INSTANCE.hudManager.testMod.isEnabled()));
		this.buttonList.add(new GuiButton(2, 100,this.height /2 + 30, "FPSMod | " + Client.INSTANCE.hudManager.testMod.isEnabled()));
		this.buttonList.add(new GuiButton(3, 100,this.height /2 + 60, "KeystrokesMod | " + Client.INSTANCE.hudManager.testMod.isEnabled()));
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if(button.id == 1) {
			Client.INSTANCE.hudManager.testMod.toggle();
		}
		if(button.id == 2) {
			Client.INSTANCE.hudManager.fpsMod.toggle();
		}
		if(button.id == 3) {
			Client.INSTANCE.hudManager.keystrokes.toggle();
		}
		super.actionPerformed(button);
	}
	
	
	
}