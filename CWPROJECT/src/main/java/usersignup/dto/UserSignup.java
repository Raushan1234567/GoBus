package usersignup.dto;

import jakarta.persistence.*;

@Entity
public class UserSignup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int UserId;
	private String Email;
	private String Password;
	private String Name;
	private String Address ;
	private String MObileNo;
	public UserSignup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSignup(String email, String password, String name, String address, String mObileNo) {
		super();
		Email = email;
		Password = password;
		Name = name;
		Address = address;
		MObileNo = mObileNo;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMObileNo() {
		return MObileNo;
	}
	public void setMObileNo(String mObileNo) {
		MObileNo = mObileNo;
	}
	@Override
	public String toString() {
		return "UserSignup [UserId=" + UserId + ", Email=" + Email + ", Password=" + Password + ", Name=" + Name
				+ ", Address=" + Address + ", MObileNo=" + MObileNo + "]";
	}
	
	

}
