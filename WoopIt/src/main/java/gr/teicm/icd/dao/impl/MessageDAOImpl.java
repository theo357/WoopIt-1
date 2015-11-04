package gr.teicm.icd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.springsource.tcserver.serviceability.request.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import gr.teicm.icd.data.entities.User;
import gr.teicm.icd.dao.UserDAO;

import gr.teicm.icd.dao.MessageDAO;
import gr.teicm.icd.data.entities.Message;

public class MessageDAOImpl implements MessageDAO{

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public void insertMessage(Message message){
		String sqlQuery = "INSERT INTO MESSAGES " + 
						"(MESSAGE_BODY, MESSAGE_SENDER) " +
						"VALUES (?, ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1,  message.getContent());
			ps.setString(2, message.getSender().getUserName());
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
		finally{
			if (conn != null){
				try{
					conn.close();
				}
				catch(SQLException e){
					
				}
			}
		}
	}
}
