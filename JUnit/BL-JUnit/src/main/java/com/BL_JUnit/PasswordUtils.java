package com.BL_JUnit;

public class PasswordUtils 
{
	// Minimum length for a decent password
    
    protected static final int MAX_LENGTH = 12;
 
    
     //The random number generator.
    
    private static java.util.Random r = new java.util.Random();
 
   
     //I, L and O are good to leave out as are numeric zero and one.
     
    private static final String DIGITS = "23456789";
    private static final String LOCASE_CHARACTERS = "abcdefghjkmnpqrstuvwxyz";
    private static final String UPCASE_CHARACTERS = "ABCDEFGHJKMNPQRSTUVWXYZ";
    private static final String SYMBOLS = "@#$%=:?";
    private static final String ALL = DIGITS + LOCASE_CHARACTERS + UPCASE_CHARACTERS + SYMBOLS;
    private static final char[] upcaseArray = UPCASE_CHARACTERS.toCharArray();
    private static final char[] locaseArray = LOCASE_CHARACTERS.toCharArray();
    private static final char[] digitsArray = DIGITS.toCharArray();
    private static final char[] symbolsArray = SYMBOLS.toCharArray();
    private static final char[] allArray = ALL.toCharArray();
 
    
//     Generate a random password based on security rules
//     
//     - at least 8 characters, max of 12
//     - at least one uppercase
//     - at least one lowercase
//     - at least one number
//     - at least one symbol
    
    
    public static String generatePassword() {
        StringBuilder sb = new StringBuilder();
 
        // get at least one lowercase letter
        sb.append(locaseArray[r.nextInt(locaseArray.length)]);
 
        // get at least one uppercase letter
        sb.append(upcaseArray[r.nextInt(upcaseArray.length)]);
 
        // get at least one digit
        sb.append(digitsArray[r.nextInt(digitsArray.length)]);
 
        // get at least one symbol
        sb.append(symbolsArray[r.nextInt(symbolsArray.length)]);
 
        // fill in remaining with random letters
        for (int i = 0; i < MAX_LENGTH - 4; i++) {
            sb.append(allArray[r.nextInt(allArray.length)]);
        }
 
        return sb.toString();
    }
 
   public static void main(String[] args) {
       
       // generate the password
       String thePassword = PasswordUtils.generatePassword();
       
       // now print it out
       System.out.println("Generated password is: " + thePassword);
   }

public static boolean validatePassword(String thePassword) {
	// TODO Auto-generated method stub
	return true;
}
}
