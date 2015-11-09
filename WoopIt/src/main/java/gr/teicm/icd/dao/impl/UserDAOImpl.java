package gr.teicm.icd.dao.impl;

//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import java.util.List;

import org.apache.log4j.spi.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.bytecode.buildtime.spi.Logger;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

import gr.teicm.icd.dao.UserDAO;
import gr.teicm.icd.data.entities.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@Override
	public void insertUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User saved successfully, User Details="+user);
	}

	@Override
	public User getUserById(Long id) {
        Session session = this.sessionFactory.getCurrentSession();      
        User usr = (User) session.load(User.class, new Long(id));
        logger.info("User loaded successfully, User details="+usr);
        return usr;
	}

	@Override
	public Boolean checkIfUserNameExist(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
        logger.info("User updated successfully, User Details="+user);	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> usersList = session.createQuery("from User").list();
        for(User usr : usersList){
            logger.info("User List::"+usr);
        }
        return usersList;
	}

	@Override
	public void removeUser(Long id) {
        Session session = this.sessionFactory.getCurrentSession();
        User usr = (User) session.load(User.class, new Long(id));
        if(null != usr){
            session.delete(usr);
        }
        logger.info("User deleted successfully, user details="+usr);
	}


}
