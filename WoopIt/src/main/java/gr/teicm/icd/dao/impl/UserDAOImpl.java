package gr.teicm.icd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
 
import gr.teicm.icd.data.entities.User;
import gr.teicm.icd.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(User user){
		
		String sql = "INSERT INTO USERS " +
				"(USER_NAME, USER_PASS) VALUES (?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setLong(1, user.getUserId());
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPass());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public User findByUserId(Long userId){
		
		String sql = "SELECT * FROM USERS WHERE USER_ID = ?";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, userId);
			User user = new User();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user.setUserId(rs.getLong("USER_ID"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setUserPass(rs.getString("USER_PASS"));
			}
			rs.close();
			ps.close();
			return user;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} 
			catch (SQLException e) {}
			}
		}
	}
	
	public Boolean checkIfUserNameExist(String userName){
		
		String sql = "SELECT * FROM USERS WHERE USER_NAME = ?";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			if (rs.first()) {
				rs.close();
				ps.close();
				return true;
			}
			else{
				rs.close();
				ps.close();
				return false;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} 
			catch (SQLException e) {}
			}
		}
	}
}
