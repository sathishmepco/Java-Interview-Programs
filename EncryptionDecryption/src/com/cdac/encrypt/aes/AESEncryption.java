package com.cdac.encrypt.aes;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/*
 * import java.util.Base64; this class is available from java 1.8
 * else you can use apache library for Base64
 */
public class AESEncryption {

	public static void main(String[] args) 
	{
		final String strToEncrypt = "My text to encrypt";
        final String strPssword = "f2fc2007-b24b-4ab5-b62f-8dba873d0341";
        encryptdecrypt.setKey(strPssword);
		//encryptdecrypt is called from main funcation
        encryptdecrypt.encrypt(strToEncrypt.trim());
        System.out.println("String to Encrypt: " + strToEncrypt); 
        System.out.println("Encrypted: " + encryptdecrypt.getEncryptedString());
        final String strToDecrypt =  encryptdecrypt.getEncryptedString();
        encryptdecrypt.decrypt(strToDecrypt.trim());
        System.out.println("String To Decrypt : " + strToDecrypt);
        System.out.println("Decrypted : " + encryptdecrypt.getDecryptedString());
	}
}

//class encryptdecrypt increases the readability of the code. So, it is extracted to another new class.
//funcationality remains the same besides having refactoring
class encryptdecrypt
{
	private static SecretKeySpec secretKey;
	private static byte[] key;
	private static String decryptedString;
	private static String encryptedString;

	public static void setKey(String myKey)
	 {
		MessageDigest sha = null;
		try {
			key = myKey.getBytes("UTF-8");
			System.out.println(key.length);
			sha = MessageDigest.getInstance("SHA-256");
			key = sha.digest(key);
			//key = Arrays.copyOf(key, 32);
			System.out.println(key.length);
			System.out.println(new String(key, "UTF-8"));
			secretKey = new SecretKeySpec(key, "AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static String getDecryptedString() {
		return decryptedString;
	}

	public static void setDecryptedString(String decString) {
		decryptedString = decString;
	}

	public static String getEncryptedString() {
		return encryptedString;
	}

	public static void setEncryptedString(String encString) {
		encryptedString = encString;
	}

	public static String encrypt(String strToEncrypt) {
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] buff = cipher.doFinal(strToEncrypt.getBytes("UTF-8"));
			setEncryptedString(Base64.getEncoder().encodeToString(buff));
		} catch (Exception e) {
			System.out.println("Error while encrypting: " + e.toString());
		}
		return null;
	}

	public static String decrypt(String strToDecrypt) {
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			setDecryptedString(new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt))));
		} catch (Exception e) {
			System.out.println("Error while decrypting: " + e.toString());
		}
		return null;
	}
}