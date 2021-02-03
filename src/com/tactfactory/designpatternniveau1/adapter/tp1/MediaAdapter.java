package com.tactfactory.designpatternniveau1.adapter.tp1;

public class MediaAdapter implements MediaPlayer {
	public String type = "mp3";
	private Mp4Player adaptee1 = new Mp4Player();
	private VlcPlayer adaptee2 = new VlcPlayer();	
	
	
	public MediaAdapter(String type) {
		this.type = type;
	}

//	MediaPlayer player = new MediaAdapter();
	
	
	public void play(String audioType, String fileName) {
		switch(type) {
		case "adaptee1":
			adaptee1.play(audioType, fileName);
			break;
		case "adaptee2":
			adaptee2.play(audioType, fileName);
		default:
			System.out.println("Invalid media." + audioType + "format not supported");
			break;
		}
			
	}
	
}
