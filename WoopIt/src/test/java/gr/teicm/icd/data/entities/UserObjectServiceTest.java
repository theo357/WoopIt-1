package gr.teicm.icd.data.entities;

import org.junit.Assert;
import org.junit.Test;

public class UserObjectServiceTest{
	
	@Test
	public void shouldCreateUserAndReturnName()
	{
		//Given
		String name = "panos_r21";
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
		String pass = "abc%123";
		//When
		User user = new User();
		user.setUserPass(pass);
		//Then
		Assert.assertTrue(user.getUserPass().equals(pass));
	}
	
	@Test
	public void shouldCreateUserAndReturnEmail()
	{
		//Given
		String email = "test123@gmail.com";
		//When
		User user = new User();
		user.setUserEmail(email);
		//Then
		Assert.assertTrue(user.getUserEmail().equals(email));
	}
	
	@Test
	public void shouldCreateUserAndReturnSex()
	{
		//Given
		String sex = "Male";
		//When
		User user = new User();
		user.setUserSex(sex);
		//Then
		Assert.assertTrue(user.getUserSex().equals(sex));
	}
	
	@Test
	public void shouldCreateUserAndReturnCountry()
	{
		//Given
		String country = "Greece";
		//When
		User user = new User();
		user.setUserCountry(country);
		//Then
		Assert.assertTrue(user.getUserCountry().equals(country));
	}
}
