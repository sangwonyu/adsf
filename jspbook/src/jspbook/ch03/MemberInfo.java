package jspbook.ch03;

import java.util.Objects;

public class MemberInfo {
	private String name;
	private String email;
	private String phone;
	private int id;
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void action() {
		if(phone!=null) {
			id=Objects.hash(name,email,phone);
			System.out.println(toString());
		}
	}
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", email=" + email + ", phone=" + phone + ", id=" + id + "]";
	}
	
}
