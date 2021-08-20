package com.BL_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class UserRegistrationTest{

//	@Test
//	void testSquareOfNumber() 
//	{
//		UserRegistration obj = new UserRegistration();
//		int res = obj.sq(5);
//		assertEquals(25, res);
//	}

	
	@Test
	public void getFirstNameTest()
	{
		String firstName = "Aparna";
		String lastName = "Jadhav";
		String email = "test@test.com";
		String mobile = "91 9012345678";
		
		UserRegistration obj = new UserRegistration();
		obj.setRegistrationParam(firstName, lastName, email, mobile);
		
		String resultFirstName = obj.getFirstName();
		String resultLirstName = obj.getLastName();
		String resultEmailId = obj.getEmail();
		String resultMobileNumber = obj.getMobile();
		
		
		assertEquals(firstName, resultFirstName);
		assertEquals(lastName, resultLirstName);
		assertEquals(email, resultEmailId);
		assertEquals(mobile, resultMobileNumber);
	}
}
