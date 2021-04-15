package day21;

public class LoginForm {
	
	String uname;
	String upass;
	public LoginForm() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginForm [uname=" + uname + ", upass=" + upass + "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	

}
