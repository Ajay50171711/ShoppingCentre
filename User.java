package table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	
	private String Name;
	private String Email;
	private String Password;
	private String PhoneNo;
	
	@Column(length = 1500)
	private String Address;
	
	private String ProfilePic;

	public User(int userid, String name, String email, String password, String phoneNo, String address,
			String profilePic) {
		super();
		this.userid = userid;
		Name = name;
		Email = email;
		Password = password;
		PhoneNo = phoneNo;
		Address = address;
		ProfilePic = profilePic;
	}

	public User() {
		super();
	}

	public User(String name, String email, String password, String phoneNo, String address, String profilePic) {
		super();
		Name = name;
		Email = email;
		Password = password;
		PhoneNo = phoneNo;
		Address = address;
		ProfilePic = profilePic;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getProfilePic() {
		return ProfilePic;
	}

	public void setProfilePic(String profilePic) {
		ProfilePic = profilePic;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password
				+ ", PhoneNo=" + PhoneNo + ", Address=" + Address + ", ProfilePic=" + ProfilePic + "]";
	}
	
	
	
	
}
