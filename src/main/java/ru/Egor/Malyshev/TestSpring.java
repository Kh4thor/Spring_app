package ru.Egor.Malyshev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext (
				"applicationContext.xml");

		
//		ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
		
		
		ClassicalMusic cm = context.getBean("musicBean", ClassicalMusic.class);
		ClassicalMusic cm2 = context.getBean("musicBean", ClassicalMusic.class);
		
		
		
//		System.out.println(classicalMusic.getSong());
	
		System.out.println(cm);
		System.out.println(cm2);
		
		context.close();
		
		
//		Music music = context.getBean("musicBean", Music.class);
//		MusicPlayer musicPlayer = new MusicPlayer (music);
//		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); 
		
//		System.out.println(musicPlayer.getName());
//		System.out.println(musicPlayer.getVolume());
		
//		musicPlayer.playMusicList();
//		context.close();
		
		
		
		
//		TestBean testBean = context.getBean("testBean", TestBean.class);
//		System.out.println(testBean.getName());
//		context.close();
	}
		
}
