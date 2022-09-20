package ru.Egor.Malyshev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	
		private Music music;
		private ClassicalMusic classicalMusic;
		private RockMusic rockMusic;
		
	
	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
	
	public MusicPlayer () {		
	}
	@Autowired
	public MusicPlayer (ClassicalMusic classicalMusic, RockMusic rockMusic) {
		this.classicalMusic = classicalMusic;
		this.rockMusic = rockMusic;
	}
		
	@Override
	public String toString() {
		return "MusicPlayer [classicalMusic=" + classicalMusic.getSong() + ", rockMusic=" + rockMusic.getSong() + "]";
	}

	public String playMusic () {
		return classicalMusic.getSong();
		}
		
	}


