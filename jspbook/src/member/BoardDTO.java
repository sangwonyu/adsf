package member;

public class BoardDTO {
	private int id;
	private int memberId;
	private String date;
	private String title;
	private String content;
	private String name;

	
	public BoardDTO(int id, int memberId, String title, String date, String content) {
		super();
		this.id = id;
		this.memberId=memberId;
		this.title=title;
		this.date = date;
		this.content = content;
	}
	
	public BoardDTO() {}

	public BoardDTO(int id,String title,String content) {
		this.id = id;
		this.title=title;
		this.content = content;
	}
	
	public BoardDTO(int memberId,String title, String date, String content) {
		this.memberId = memberId;
		this.title=title;
		this.content = content;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
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
		this.memberId=memberId;
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

	@Override
	public String toString() {
		return "id=" + id + ", memberId=" + memberId + ", date=" + date + ", title=" + title + ", content="
				+ content;
	}
	
	
}
