package dao;


import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


@SuppressWarnings("serial")
public class MyInterceter extends AbstractInterceptor {

	public String intercept(ActionInvocation arg0) throws Exception {
		//���ActionContextʵ��
		ActionContext context = arg0.getInvocationContext();
		//���ʵ���е�session
		Map<String, Object> session =  context.getSession();
		String namee = (String) session.get("userr");
		if (namee != null && "admin".equals(namee)) {
			return arg0.invoke();
		}
		session.put("tip", "����û�е�¼������?");
		return "login1";
	}
	
}
