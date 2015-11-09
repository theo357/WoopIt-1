package gr.teicm.icd.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import org.apache.log4j.spi.*;
//import org.apache.log4j.spi.LoggerFactory;
import org.hibernate.*;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.*;
import org.slf4j.*;
import org.springframework.stereotype.*;


import java.sql.*;
import java.util.*;
import gr.teicm.icd.dao.*;
import gr.teicm.icd.data.entities.*;

@Repository
public class MessageDAOImpl implements MessageDAO{

	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void insertMessage(Message message) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(message);
        logger.info("Message saved successfully, Message Details="+message);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Message> listMessages() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Message> messagesList = session.createQuery("from Message").list();
        for(Message msg : messagesList){
            logger.info("Message List::"+msg);
        }
        return messagesList;
	}
	/*private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	
	//TODO MESSAGE_USER_ID must be fetched by Sender attribute of Message
	public void insertMessage(Message message){
		String sqlQuery = "INSERT INTO MESSAGES " + 
						"(MESSAGE_USER_ID, MESSAGE_BODY) " +
						"VALUES(?, ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ps.setString(1, "19");
			ps.setString(2, message.getContent());
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
					System.out.println("");
				}
			}
		}
	}
	
	public List<Message> getAllMessages(){
		
		List<Message> allMessages = new ArrayList<>();
		String sqlQuery = "SELECT * FROM MESSAGES";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ResultSet data = ps.executeQuery();
			while(data.next()){
				Message msg = new Message();
				msg.setContent(data.getString("MESSAGE_BODY"));
				allMessages.add(msg);
			}
			ps.close();
			return allMessages;
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
					System.out.println("");
				}
			}
		}
		
	}
	
	/*private User getSender(Message message){
		String sqlQuery1 = "SELECT MESSAGE_USER_ID FROM MESSAGES WHERE MESSAGE_ID = ?";
		String sqlQuery2 = "SELECT USER_NAME FROM USERS WHERE USER_ID =?";
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sqlQuery1);
		}
	}*/


}
