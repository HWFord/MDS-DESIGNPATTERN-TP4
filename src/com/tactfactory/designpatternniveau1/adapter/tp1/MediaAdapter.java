package com.tactfactory.designpatternniveau1.adapter.tp1;

public class MediaAdapter implements MediaPlayer {
	private String type;
	private AudioPlayer adaptee3 = new AudioPlayer();
	private Mp4Player adaptee1 = new Mp4Player();
	private VlcPlayer adaptee2 = new VlcPlayer();	
	
	public MediaAdapter(String type) {
		this.type = type;
	}	
	
	public void play(String audioType, String fileName) {
		switch(type) {
		case "mp4":
			adaptee1.play(audioType, fileName);
			break;
		case "vlc":
			adaptee2.play(audioType, fileName);
			break;
		case "mp3":
			adaptee3.play(audioType, fileName);
			break;
		default:
			System.out.println("Invalid media." + audioType + "format not supported");
			break;
		}
			
	}
	
}
