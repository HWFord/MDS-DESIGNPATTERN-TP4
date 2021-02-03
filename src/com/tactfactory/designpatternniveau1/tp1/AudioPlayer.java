package com.tactfactory.designpatternniveau1.tp1;

public class AudioPlayer implements MediaPlayer  {
	
	public static void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
	}

}
