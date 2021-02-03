package com.tactfactory.designpatternniveau1.tp1;

public class VlcPlayer implements MediaPlayer {
	
	public static void play(String audioType, String fileName) {

	    if (audioType.equalsIgnoreCase("vlc")) {
	      System.out.println("Playing vlc file. Name: " + fileName);
	    }
	  }
}
