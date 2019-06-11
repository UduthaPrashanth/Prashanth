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


public String getUserName1() {
		return userName1;
	}
	public void setUserName1(String userName) {
		this.userName1 = userName;
	}
	public String getUserPojo1() {
		return userPojo1;
	}
	public void setUserPojo1(String userPojo) {
		this.userPojo1 = userPojo;
	}
	public String getUserLocation1() {
		return userLocation1;
	}
	public void setUserLocation1(String userLocation) {
		this.userLocation1 = userLocation;
	}
private String userName1;
private String userPojo1;
private String userLocation1;
private String userName;
private String userPojo;
private String userLocation;





	
	
	 
	 @Column(name="location")
private String location1;
	 
	 
	 

public String getUserName() {
		return userName1;
	}
	public void setUserName(String userName) {
		this.userName1 = userName;
	}
	public String getUserPojo() {
		return userPojo1;
	}
	public void setUserPojo(String userPojo) {
		this.userPojo1 = userPojo;
	}
	public String getUserLocation() {
		return userLocation1;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation1 = userLocation;
	}
	
	private String location;




		public String getLocation() {
		return location1;
	}
private String Nothing;
	public String getNothing() {
	return Nothing;
}
public void setNothing(String nothing) {
	Nothing = nothing;
}
	
	 
public void setLocation(String location) {
	this.location1 = location;

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
