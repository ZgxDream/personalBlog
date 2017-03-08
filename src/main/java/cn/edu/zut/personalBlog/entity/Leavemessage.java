package cn.edu.zut.personalBlog.entity;

import java.util.Date;

public class Leavemessage {
	
	public int id;
	
	public int visitor_id;
	
	public String cntent;
	
	public Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVisitor_id() {
		return visitor_id;
	}

	public void setVisitor_id(int visitor_id) {
		this.visitor_id = visitor_id;
	}

	public String getCntent() {
		return cntent;
	}

	public void setCntent(String cntent) {
		this.cntent = cntent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Leavemessage [id=" + id + ", visitor_id=" + visitor_id
				+ ", cntent=" + cntent + ", date=" + date + "]";
	}
	
	

}
