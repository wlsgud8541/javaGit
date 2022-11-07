package day18;

import java.util.ArrayList;

public class BlackPink {
	private String name;
	private String id;
	private String mail;
	private ArrayList member;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public ArrayList getMember() {
		return member;
	}
	
	public void setMember(ArrayList member) {
		this.member = member;
	}
	
	public void setMember() {
		member = new ArrayList();
		member.add(name);
		member.add(id);
		member.add(mail);
		this.member = member;
	}
	
}
