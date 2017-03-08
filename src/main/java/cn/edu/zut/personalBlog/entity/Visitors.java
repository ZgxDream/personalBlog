package cn.edu.zut.personalBlog.entity;

import java.util.Date;

public class Visitors {
	
	public int id;
	
	public String ip;
	
	public Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "visitors [id=" + id + ", ip=" + ip + ", date=" + date + "]";
	}
	
	

}
