package Openchallenge;


public class Song {
	//field
	String title;
	String artist;
	String album;
	String composer;
	int year;
	int track;
	
	//생성자
	public Song(String title, String artist, String album, String composer, int year, int track) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	//메소드 
	
	
	
	
}
