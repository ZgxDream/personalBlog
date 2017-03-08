package cn.edu.zut.personalBlog.entity;

public class Identity {

	public int id;
	
	public String name;
	
	public int sex;
	
	public String qq_name;
	
	public String phone;
	
	public String email;
	
	public String resume;
	
	public String pwd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getQq_name() {
		return qq_name;
	}

	public void setQq_name(String qq_name) {
		this.qq_name = qq_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "identity [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", qq_name=" + qq_name + ", phone=" + phone + ", email="
				+ email + ", resume=" + resume + ", pwd=" + pwd + "]";
	}
	
	
}
