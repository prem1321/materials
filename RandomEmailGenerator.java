package lib;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmailGenerator {
	  
	public static String generateEmail(int length) {
	String allowedChars ="abcdefghijklmnopqrstuvwxyz" +   "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "1234567890";   //alphabets and numbers

    String email="";
    String temp=RandomStringUtils.random(length,allowedChars);
    email=temp.substring(0,temp.length()-13)+"@message-checker.appspotmail.com";
    return email;

}
}