package com.gamedev.dotdev;

import com.esotericsoftware.minlog.Log;
import com.gamedev.dotdev.gui.GuiMainMenu;
import com.remote.remote2d.engine.Remote2D;
import com.remote.remote2d.engine.Remote2DGame;

public class DotDev extends Remote2DGame {
	
	public static void main(String args[])
	{
		Log.DEBUG();
		Remote2D.startRemote2D(new DotDev());
	}

	@Override
	public void initGame() {
		Remote2D.guiList.push(new GuiMainMenu());
	}
	
}
