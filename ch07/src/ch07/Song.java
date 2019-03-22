package ch07;

public class Song {

	String title; // 노래 제목
	String artist; // 아티스트
	String album; // 노래가 속한 앨범 제목
	String composer; // 작곡가
	int year; // 노래 발표년도
	int track; // 노래가 속한 앨범의 트랙번호
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println("Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]");
	}
	

}
