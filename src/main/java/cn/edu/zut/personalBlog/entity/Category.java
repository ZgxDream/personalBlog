package cn.edu.zut.personalBlog.entity;

public class Category {
	public int id;
	
	public String ca_name;
	
	public String ca_resume;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "category [id=" + id + ", ca_name=" + ca_name + ", ca_resume="
				+ ca_resume + "]";
	}
	
	

}
