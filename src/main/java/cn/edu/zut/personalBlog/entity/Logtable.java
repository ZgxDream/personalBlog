package cn.edu.zut.personalBlog.entity;

import java.util.Date;

public class Logtable {

	public int id;
	
	public Date date;
	
	public String title;
	
	public String  content;
	
	public int category_id;
	
	public int number;
	
	public int likes;
	
	public String ca_name;
	
	public String ca_resume;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
    
	public String getCa_name() {
		return ca_name;
	}

	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}

	public String getCa_resume() {
		return ca_resume;
	}

	public void setCa_resume(String ca_resume) {
		this.ca_resume = ca_resume;
	}

	@Override
	public String toString() {
		return "Logtable [id=" + id + ", date=" + date + ", title=" + title + ", content=" + content + ", category_id="
				+ category_id + ", number=" + number + ", likes=" + likes + ", ca_name=" + ca_name + ", ca_resume="
				+ ca_resume + "]";
	}

    
}