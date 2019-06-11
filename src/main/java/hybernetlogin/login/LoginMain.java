package hybernetlogin.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class LoginMain extends HttpServlet {
	static Session s = null;
	static {
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		 s = sf.openSession();
		/*
		 * Transaction t=s.beginTransaction(); Login l=new Login(); String
		 * email=l.getEmail(); String Password=l.getPassword(); String
		 * mobile=l.getMobile(); String city=l.getCity();
		 */
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("mail");
		String Pwd = req.getParameter("password");
		String mobile = req.getParameter("mobile");
		String city = req.getParameter("city");

		Login l = new Login();
		l.setEmail(email);
		l.setMobile(mobile);
		l.setPassword(Pwd);
		l.setCity(city);

		/*
		 * org.hibernate.Query Q=
		 * s.createQuery("insert into modifier values(?,?,?,?)");
		 * 
		 * Q.setParameter(0, l.getEmail()); Q.setParameter(1, l.getMobile());
		 * Q.setParameter(2, l.getPassword()); Q.setParameter(3, l.getCity());
		 */
		s.save(l);
		Transaction t = s.beginTransaction();
		t.commit();
		s.close();
	}
}
