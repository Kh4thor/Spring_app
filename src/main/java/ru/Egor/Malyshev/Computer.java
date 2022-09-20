package ru.Egor.Malyshev;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private int id;
	private MusicPlayer musicPlyer;
	
	public Computer (MusicPlayer musicPlyer) {
		this.id = 1;
		this.musicPlyer = musicPlyer;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", musicPlyer=" + musicPlyer + "]";
	}

	
		

}
