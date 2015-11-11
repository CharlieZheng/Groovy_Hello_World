package com.cndatacom.work

import com.cndatacom.javabean.Song

class SongExample {

	static main(args) {
		def song1 = new Song(name : "Le Freak", artist : "Chic", genre : "Disco")

		def song2 = new Song(name:"Kung Fu Fighting", genre:"Disco")

		def song3 = new Song()
		song3.name = "Funkytown"
		song3.artist = "Lipps Inc."
		song3.setGenre("Disco")
		song3.setName 'Imagine Dragons'
		assert song3.getArtist() == "Lipps Inc."
		assert song3.name == "Imagine Dragons"
		println song3.genre

		def song4 = new Song(name:"Thriller", artist:"Michael Jackson")
		println song4.genre
		println song4
	}
}
