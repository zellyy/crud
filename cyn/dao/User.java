package dao;

import dao.Person;

public class User {

	private String id;
	private String aihao;
	private String username;
	private String name;
	private String sex;
	private String qq;
	private String password;
	Person s=null;
	@SuppressWarnings("unused")
	private String nr;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAihao() {
		return aihao;
	}
	public void setAihao(String aihao) {
		this.aihao = aihao;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNr() {
		
		// TODO 自动生成的方法存�?
		return nr;
	}
	public void setNr(String nr) {
		this.nr = nr;
	}
}