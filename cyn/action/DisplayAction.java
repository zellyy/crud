package action;

import java.util.List;

import dao.PersonDaoImpl;
import dao.Person;

public class DisplayAction {
	private List<Person> list;
	public List<Person> getList() {
		return list;
	}
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{
		PersonDaoImpl ss=new PersonDaoImpl();
		ss.setDao(new PersonDaoImpl());
		list=ss.selectAll();
		return "success";
	}
}
