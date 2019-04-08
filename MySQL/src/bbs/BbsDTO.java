package bbs;

public class BbsDTO {
	private int id;
	private int memberId;
	private String title;
	private String date;
	private String content;
	private String name;
	
	public BbsDTO(int id, int memberId, String title, String date, String content) {
		this.id = id;
		this.memberId = memberId;
		this.title = title;
		this.date = date;
		this.content = content;
	}
	public BbsDTO(String title, int memberId, String content) {
		this.title = title;
		this.memberId = memberId;
		this.content = content;
	}
	public BbsDTO(String title, String content,int id) {
		this.title = title;
		this.content = content;
		this.id = id;
	}
	public BbsDTO() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", Name=" + name + ", title=" + title + ", date=" + date + ", content="
				+ content + "]";
	}
	
	
	
}
