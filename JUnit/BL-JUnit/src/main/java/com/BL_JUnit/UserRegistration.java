package com.BL_JUnit;

import org.junit.jupiter.api.Test;

public class UserRegistration 
{
		String firstName;
		String lastName;
		String email;
		String mobile;
		
		
		public void setRegistrationParam(String firstName, String lastName, String email, String mobile)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			this.email=email;
			this.mobile=mobile;
		}
		
//		public static int sq(int x)
//		{
//			return x*x;
//		}
		
		
		public String getFirstName()
		{
			return firstName;
		}
		
		public String getLastName()
		{
			return lastName;
		}
		
		public String getEmail()
		{
			return email;
		}
		
		public String getMobile()
		{
			return mobile;
		}
		

}
