package com.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.connection.MyConnection;
import com.javabeans.Employee;

public class empDao {
	public boolean Insert(Employee reg) {
		String sql="insert into projectp(empname,password,empEmail) values(?,?,?)";
		try {
			PreparedStatement st= MyConnection.getConnect().prepareStatement(sql);
			st.setString(1, reg.getEmpname());
			st.setString(2, reg.getPassword());
			st.setString(3,reg.getEmpEmail());
			return st.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		

 }
	public boolean insert2(String user) {
		String sql="insert into project1(empname,login) values(?,now())";
		try {
			PreparedStatement st= MyConnection.getConnect().prepareStatement(sql);
			st.setString(1,user);
			return st.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public boolean updateIn(String d1) {
		String sql="update project1 set logout=now() where login=?"; 
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,d1);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean updateOut(String d1) {
		String sql="update project1 set logout=now() where login=?"; 
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,d1);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}


	public String checkUser(String user) {
		String sql="select password from projectp where empname=?";
		try {
			PreparedStatement st= MyConnection.getConnect().prepareStatement(sql);
			st.setString(1,user);
			ResultSet rd=st.executeQuery();
			String pass=null;
			while(rd.next()) {
				pass=rd.getString("password");
			}
			return pass;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	public boolean updateEmpIn(String user) {
		String sql="update projectp set login=now() where empName=?"; 
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	public boolean updateEmpOut(String user) {
		String sql="update projectp set logout=now() where empName=?"; 
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	public List<Employee> getUsers(String  s){
		List<Employee> list=new ArrayList<>();
		String sql="select * from project1 where empName=?";
		try {
			PreparedStatement st=MyConnection.getConnect().prepareStatement(sql);
			st.setString(1,s);
			Employee em=null;
			ResultSet res=st.executeQuery();
			while(res.next()) {
					String user=res.getString("empname");
					String login=res.getString("login");
					String logout=res.getString("logout");
					em=new Employee(user,null,null,login,logout);
					list.add(em);
					}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public String getIn(String user) {
		String sql="select login from project1 where empname=? order by login desc limit 1";
		try {
			PreparedStatement st=MyConnection.getConnect().prepareStatement(sql);
			st.setString(1,user);
			ResultSet res=st.executeQuery();
			String d=null;
			while(res.next()) {
				d=res.getString("login");
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public String getout(String user) {
		String sql="select logout from project1 where empname=? order by logout desc limit 1";
		try {
			PreparedStatement st=MyConnection.getConnect().prepareStatement(sql);
			st.setString(1,user);
			ResultSet res=st.executeQuery();
			String d=null;
			while(res.next()) {
				d=res.getString("logout");
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		}
	


}