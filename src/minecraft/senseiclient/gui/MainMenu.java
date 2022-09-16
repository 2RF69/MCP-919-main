package senseiclient.gui;


import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import senseiclient.Client;

import org.lwjgl.input.Mouse;

import java.io.IOException;

public class MainMenu extends GuiScreen {
	
	
	@Override
	public void initGui() {
		this.buttonList.add(new GuiButton(0, 100,this.height /2, "SinglePlayer"));
		this.buttonList.add(new GuiButton(1, 100,this.height /2 + 30, "MultiPlayer"));
		this.buttonList.add(new GuiButton(2, 100,this.height /2 + 60, "Options"));
		this.buttonList.add(new GuiButton(3, 100,this.height /2 + 90, "Quit Game"));
		super.initGui();
	}
	
	
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		mc.getTextureManager().bindTexture(new ResourceLocation("client/MainMenu.png"));
		this.drawModalRectWithCustomSizedTexture(0, 0, 0, 0, this.width, this.height, this.width, this.height);
		GlStateManager.pushMatrix();
		GlStateManager.translate(-(width/1.985f), -(height/2f), 0);
		GlStateManager.scale(2, 2, 2);
		mc.fontRendererObj.drawStringWithShadow(Client.INSTANCE.name, this.width /2 - 150, this.height /2 -88, -1);
		GlStateManager.popMatrix();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	




	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		if(button.id == 0) {
			mc.displayGuiScreen(new GuiSelectWorld(this));
	}
		if(button.id == 1) {
			mc.displayGuiScreen(new GuiMultiplayer(this));
	}
		if(button.id == 2) {
			mc.displayGuiScreen(new GuiOptions(this, mc.gameSettings));
	}
		if(button.id == 3) {
			mc.shutdown();
	}
		super.actionPerformed(button);
	}
	
	
      }
