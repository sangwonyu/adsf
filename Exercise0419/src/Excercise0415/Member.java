package Excercise0415;

public class Member implements Comparable<Member>{
	public String name;
	public String mail;
	public String phone;
	
	public Member(String name,String mail, String phone) {
		this.name = name;
		this.phone = phone;
		this.mail = mail;
	}
	
	public Member(String name,String mail) {
		this.name = name;
		this.mail = mail;
	}


	@Override
	public String toString() {
		if(name==null) {
			name="";
		}
		else if(mail==null) {
			mail="";
		}
		else if(phone==null) {
			phone="";
		}
		return name + ","+ mail + ","+ phone;
	}


	@Override
	public int compareTo(Member m) {
		if(name.compareTo(m.name)>0)
			return 1;
		if(name.compareTo(m.name)<0)
			return -1;
		return phone.compareTo(m.phone);
	}
	
	
	
}
