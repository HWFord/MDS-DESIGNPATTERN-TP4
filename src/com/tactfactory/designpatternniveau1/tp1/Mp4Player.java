package com.tactfactory.designpatternniveau1.tp1;

public class Mp4Player implements MediaPlayer {

	public static void play(String audioType, String fileName) {

	    if (audioType.equalsIgnoreCase("mp4")) {
	      System.out.println("Playing mp4 file. Name: " + fileName);
	    }
	  }
	
}
