package com.tactfactory.designpatternniveau1.adapter.tp1;

public class VlcPlayer implements MediaPlayer {
	
	public void play(String audioType, String fileName) {

	    if (audioType.equalsIgnoreCase("vlc")) {
	      System.out.println("Playing vlc file. Name: " + fileName);
	    }
	  }
}
