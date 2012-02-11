import java.math.BigInteger;
import java.security.MessageDigest;

import org.jboss.util.Base64;


public class HashwordTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		String password = "passord are fun to create";
		md5.update(password.getBytes());
		BigInteger hash = new BigInteger(1,md5.digest());
		String hashword = hash.toString(16);
		
		System.err.println(hashword);
		System.err.println(Base64.encodeBytes(md5.digest()));
		System.err.println(hashword.length());

	}

}
