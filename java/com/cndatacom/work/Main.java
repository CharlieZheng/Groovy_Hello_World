package com.cndatacom.work;

import com.cndatacom.javabean.*;

public class Main {

	public static void main(String[] args) {
		Song song = new Song();
		song.setArtist("Fly");
		song.setGenre("Rock");
		song.setName("Imagine Dragons");
		System.out.println(song);
	}

}
