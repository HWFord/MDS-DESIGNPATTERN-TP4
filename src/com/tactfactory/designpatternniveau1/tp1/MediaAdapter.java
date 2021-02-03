package com.tactfactory.designpatternniveau1.tp1;

public class MediaAdapter implements MediaPlayer {
	
	MediaPlayer player = new MediaAdapter();
	private Mp4Player adaptee1 = new Mp4Player();
	private VlcPlayer adaptee2 = new VlcPlayer();	
	
	public void play(String audioType, String fileName) {
		switch(Type) {
		case "adaptee1":
			Mp4Player.play(audioType, fileName);
			break;
		case "adaptee2":
			VlcPlayer.play(audioType, fileName);
		default:
			System.out.println("Invalid media. avi format not supported");
			break;
		}
			
	}
	
}
