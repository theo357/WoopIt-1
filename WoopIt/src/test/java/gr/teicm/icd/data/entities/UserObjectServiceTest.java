package gr.teicm.icd.data.entities;

import org.junit.Assert;
import org.junit.Test;

public class UserObjectServiceTest{
	
	@Test
	public void shouldCreateUserAndReturnName()
	{
		//Given
		String name = "panos";
		//When
		User user = new User();
		user.setUserName(name);
		//Then
		Assert.assertTrue(user.getUserName().equals(name));
	}
	
	@Test
	public void shouldCreateUserAndReturnPassword()
	{
		//Given
		String pass = "123";
		//When
		User user = new User();
		user.setUserPass(pass);
		//Then
		Assert.assertTrue(user.getUserPass().equals(pass));
	}
}
