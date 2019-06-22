package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.DAO;
import dao.User;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8729459470511280709L;
	private DAO dao = new DAO();
	private User user;
	private String sql;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public String executeRe() {
		if (user.getId().equals("") || user.getAihao().equals("") || user.getUsername().equals("")
				|| user.getName().equals("")||user.getSex().equals("") || user.getQq().equals("") ||user.getPassword().equals("")) {
			System.out.println("错误?");
			return "null_error";
		} else {
			sql = "insert into sheet1 values" + "(" +user.getId() + ","+  "'" + user.getAihao() + "'" + "," +  "'" + user.getUsername()+ "'"+ "," +  "'" + user.getName() + "'"+ "," + "'"+ user.getSex()+ "'"+ "," + user.getQq()+ ","+user.getPassword() + ")";
			System.out.println(sql);
			if (dao.executeUpdate(sql) == 1) {
				System.out.println("注册成功");
				return "success";
			} else {
				System.out.println("注册失败");
				return "register_fail";
			}
		}
	}
}
