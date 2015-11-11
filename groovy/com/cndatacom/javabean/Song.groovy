package com.cndatacom.javabean

class Song {
	def name
	def artist
	def genre
	String toString(){
		"${name}, ${artist}, ${getGenre()}"
	}
	def getGenre(){
		genre?.toUpperCase()
	}
	/*String getGenre(){
	 genre.toUpperCase()
	 }*/
}