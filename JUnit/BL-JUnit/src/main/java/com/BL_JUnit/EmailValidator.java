package com.BL_JUnit;

import java.util.StringTokenizer;

public class EmailValidator 
{
	public String isInvalidEmail(String emailAddressFalse) {
		String[][] emailAddress = {
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
		return emailAddressFalse;
    }
	
	
	
	
	public String isValidEmail(String emailAddressTure) {
		String[][] emailAddress = {
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
		return emailAddressTure;
    }
	
	
	
	
	public static boolean isValidEmailAddress(String[][] emailAddress)
	  {
	    // a null string is invalid
	    if ( emailAddress == null )
	      return false;

	    // a string without a "@" is an invalid email address
	    if ( emailAddress.length < 0 )
	      return false;

	    // a string without a "."  is an invalid email address
	    if ( emailAddress.length < 0 )
	      return false;

	    if ( lastEmailFieldTwoCharsOrMore(emailAddress) == false )
	      return false;
		return false;
	  }
	
	
	private static boolean lastEmailFieldTwoCharsOrMore(String[][] emailAddress)
	  {
	    if (emailAddress == null) return false;
	    StringTokenizer st = new StringTokenizer(".");
	    String lastToken = null;
	    while ( st.hasMoreTokens() )
	    {
	      lastToken = st.nextToken();
	    }

	    if ( lastToken.length() >= 2 )
	    {
	      return true;
	    }
	    else
	    {
	      return false;
	    }
	  }
}
