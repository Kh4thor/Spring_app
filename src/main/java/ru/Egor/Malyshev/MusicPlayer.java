package ru.Egor.Malyshev;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	
		private Music music;
		private String name;
		private int volume;
		private List<Music> musicList = new ArrayList<>();
		
		
	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void setMusics (Music music) {
		this.music = music;
	}
	
	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public MusicPlayer () {		
	}
	
	public MusicPlayer (Music music) {
		this.music = music;
	}
		
	public void playMusicList () {
		//System.out.println("Playing: " + music.getSong() );
		for (Music music : musicList) {
			System.out.println(music.getSong());
		}
		
	}

	
}
