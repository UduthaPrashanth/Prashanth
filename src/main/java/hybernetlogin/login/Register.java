package hybernetlogin.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Register extends HttpServlet{
	static Session s=null;
	static{
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf 
		= con.buildSessionFactory();
		 s = sf.openSession();
		 }
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
Query query = s.createQuery("from Login where email=:hi and password=:hello");
query.setParameter("hi", email);
query.setParameter("hello", password);
List<Login> list=query.list();
if(!list.isEmpty()){
	System.out.println("login success");
	System.out.println("login succeed");
}else{
	System.out.println("login fail");
	System.out.println("login failed");
	
}

}
}
