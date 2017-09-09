package lib;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGen {
	  
	public static String generateString(int length) {
	String allowedChars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";   //alphabets and numbers

    String Fname="";
    String temp=RandomStringUtils.random(length,allowedChars);
  Fname=temp.substring(0,temp.length()-10);
  
    return Fname;
    
    

}
}