package com.BL_JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class EmailValidatorTest {
	
	static String emailAddress;
	@Test
	public static void givenEmailShouldBeFalse() {
		String[][] emailAddressFalse = {
				{"abc@.com.my"},
                {"abc123@gmail.a"},
                {"abc123@.com"},
                {"abc123@.com.com"},
                {".abc@abc.com"},
                {"abc()*@gmail.com"},
                {"abc@%*.com"},
                {"abc..2002@gmail.com"},
                {"abc.@gmail.com"},
                {"abc@abc@gmail.com"},
                {"abc@gmail.com.1a"},
                {"13. abc@gmail.com.aa.au"}

        };
		
		EmailValidator validator = new EmailValidator();
		validator.isValidEmailAddress(emailAddressFalse);
		String resultEmailId=validator.isInvalidEmail(emailAddress);
		assertEquals(emailAddressFalse, resultEmailId);
	}	
	
	
	
	
	@Test
	public static void givenEmailShouldBeTrue() {
		String[][] emailAddressTure = {
				{"abc@yahoo.com"},
		        {"abc-100@yahoo.com,"},
		        {"abc.100@yahoo.com"},
		        {"abc111@abc.com,"},
		        {"abc-100@abc.net,"},
		        {"abc.100@abc.com.au"},
		        {"abc@1.com,"},
		        {"abc@gmail.com.com"},
		        {"abc+100@gmail.com"}		        
		};
			
			
		EmailValidator validator = new EmailValidator();
		validator.isValidEmailAddress(emailAddressTure);
		String resultEmailId=validator.isValidEmail(emailAddress);
		assertEquals(emailAddressTure, resultEmailId);
	}
}
