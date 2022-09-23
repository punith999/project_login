package com.javabeans;

public class Employee {
	private String empname;
	private String password;
	private String empEmail;
	private String login;
	private String logout;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getLogout() {
		return logout;
	}
	public void setLogout(String logout) {
		this.logout = logout;
	}
	public Employee(String empname, String password, String empEmail, String login, String logout) {
		super();
		this.empname = empname;
		this.password = password;
		this.empEmail = empEmail;
		this.login = login;
		this.logout = logout;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", password=" + password + ", empEmail=" + empEmail + ", login=" + login
				+ ", logout=" + logout + "]";
	}
	

}
