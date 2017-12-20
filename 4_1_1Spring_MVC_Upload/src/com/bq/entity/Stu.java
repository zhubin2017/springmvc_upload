package com.bq.entity;


import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Stu {
	
	@NotEmpty(message="用户名不能为空！")
	@Length(min=2,max=16,message="请输入2到16个字符")
	private String sname;
	
	@NotEmpty(message="密码不能为空！")
	@Size(min=6,max=16,message="请输入6到16个字符")
	private String pwd;
	
	@NotEmpty(message="邮箱不能为空！")
	@Pattern(regexp="\\w+@[1-9a-zA-Z]+([.][a-zA-Z]+){1,2}",message="邮箱格式不正确，如：sss@126.com")
	private String email;
	
	@NotNull(message="生日不能为空！")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
