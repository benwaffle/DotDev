package com.gamedev.dotdev.gui;

import com.remote.remote2d.editor.GuiEditor;
import com.remote.remote2d.engine.Remote2D;
import com.remote.remote2d.engine.art.Fonts;
import com.remote.remote2d.engine.gui.GuiButton;
import com.remote.remote2d.engine.gui.GuiMenu;
import com.remote.remote2d.engine.logic.Vector2;

public class GuiMainMenu extends GuiMenu {
	
	private String message = "";
	private long lastMessage = -1;
	
	@Override
	public void initGui()
	{
		buttonList.clear();
		buttonList.add(new GuiButton(0,new Vector2(screenWidth()-400,screenHeight()/2-100),new Vector2(380,40),"Play Game"));
		buttonList.add(new GuiButton(1,new Vector2(screenWidth()-400,screenHeight()/2-50),new Vector2(380,40),"Open Game Editor"));
		buttonList.add(new GuiButton(2,new Vector2(screenWidth()-400,screenHeight()/2),new Vector2(380,40),"Options"));
		buttonList.add(new GuiButton(3,new Vector2(screenWidth()-400,screenHeight()/2+50),new Vector2(380,40),"Quit"));
	}
	
	@Override
	public void render(float interpolation)
	{
		super.render(interpolation);
		Fonts.get("Courier New").drawString(".dev()", 40, screenHeight()/2-75, 150, 0x000000);
		
		if(System.currentTimeMillis()-lastMessage < 5000)
			Fonts.get("Arial").drawCenteredString(message,screenHeight()-20,20,0xff0000);
	}
	
	@Override
	public void actionPerformed(GuiButton button)
	{
		if(button.id == 0)
		{
			message = "Playing is currently not supported ;P";
			lastMessage = System.currentTimeMillis();
		} else if(button.id == 1)
			Remote2D.guiList.push(new GuiEditor());
		else if(button.id == 2)
		{
			message = "Yeah, haven't done options yet...";
			lastMessage = System.currentTimeMillis();
		} else if(button.id == 3)
			Remote2D.running = false;
	}

}
