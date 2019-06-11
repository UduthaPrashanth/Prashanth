package hybernetlogin.login;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="modifier")
public class Login {
	@Id
	@Column(name="email")
private	String email;
	
	@Column(name="mobile")
private	String mobile;
	
	@Column(name="password")
private	String password;
	
	@Column(name="city")
private	String city;
	
	 @Column(name="location")
private String location;



	public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
