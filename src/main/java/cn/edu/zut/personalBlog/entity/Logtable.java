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

	@Override
	public String toString() {
		return "logtable [id=" + id + ", date=" + date + ", title=" + title
				+ ", content=" + content + ", category_id=" + category_id
				+ ", number=" + number + ", likes=" + likes + "]";
	}
	
	

}