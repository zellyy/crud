package action;

import dao.PersonDaoImpl;
import dao.Person;

public class UpdateAction {
	Person s=null;
	private String password;
	private String id;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String execute() throws Exception {
		s=new Person();
		s.setId(id);
		s.setPassword(password);
		PersonDaoImpl stu=new PersonDaoImpl();
		stu.setDao(new PersonDaoImpl());
		stu.update(s);
		return "success";
	}
}
