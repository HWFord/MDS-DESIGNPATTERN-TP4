package com.tactfactory.designpatternniveau1.adapter.tp1;

public interface MediaPlayer extends TypeCreator {

	static void play(String audioType, String fileName) {
	}

	static TypeCreator defineType(String type) {
		    MediaPlayer result = null;

		    switch (type) {
		    case "mp4":
		      result = new Mp4Player();
		      break;
		    case "vlc":
			      result = new VlcPlayer();
			      break;

		    default:
		      result = new AudioPlayer();
		      break;
		    }

		    return (TypeCreator) result;
		  }


}
