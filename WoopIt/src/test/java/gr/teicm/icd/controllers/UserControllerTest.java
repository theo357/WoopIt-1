package gr.teicm.icd.controllers;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserControllerTest extends UserController {

	@Test
	public void shouldReturnRegisterPath()
	{
		//Given
		String path = "register";
		//Then
		Assert.assertTrue(createUser().equals(path));
	}
	
	@Test
	public void shouldReturnLoginPath()
	{
		//Given
		String path = "login";
		//Then
		Assert.assertTrue(loginPage().equals(path));
	}
	
	
	@Test
	public void shouldReturnLogoutPath()
	{
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);   
        
		//Given
        String path = "redirect:/user/login?logout";
        //Then
        Assert.assertTrue(logoutPage(request, response).equals(path));
	}
	
}
