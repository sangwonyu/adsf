package ch06;

public class Song {
	
	private String title; // 노래 제목
	private String artist; // 아티스트
	private String album; // 노래가 속한 앨범 제목
	private String composer; // 작곡가
	private int year; // 노래 발표년도
	private int track; // 노래가 속한 앨범의 트랙번호
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public void show() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
