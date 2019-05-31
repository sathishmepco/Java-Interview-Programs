package com.cdac.encrypt.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class EncryptFile {
	private SecretKeySpec secretKey;
	private Cipher cipher;

	public EncryptFile(String secret, int length, String algorithm)
			throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException {
		byte[] key = new byte[length];
		key = fixSecret(secret, length);
		this.secretKey = new SecretKeySpec(key, algorithm);
		this.cipher = Cipher.getInstance(algorithm);
	}

	private byte[] fixSecret(String s, int length) throws UnsupportedEncodingException {
		if (s.length() < length) {
			int missingLength = length - s.length();
			for (int i = 0; i < missingLength; i++) {
				s += " ";
			}
		}
		return s.substring(0, length).getBytes("UTF-8");
	}

	public void encryptFile(File f)
			throws InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException {
		System.out.println("Encrypting file: " + f.getName());
		this.cipher.init(Cipher.ENCRYPT_MODE, this.secretKey);
		this.writeToFile(f);
	}

	public void decryptFile(File f)
			throws InvalidKeyException, IOException, IllegalBlockSizeException, BadPaddingException {
		System.out.println("Decrypting file: " + f.getName());
		this.cipher.init(Cipher.DECRYPT_MODE, this.secretKey);
		this.writeToFile(f);
	}

	public void writeToFile(File f) throws IOException, IllegalBlockSizeException, BadPaddingException {
		FileInputStream in = new FileInputStream(f);
		byte[] input = new byte[(int) f.length()];
		in.read(input);

		FileOutputStream out = new FileOutputStream(f);
		byte[] output = this.cipher.doFinal(input);
		out.write(output);

		out.flush();
		out.close();
		in.close();
	}

	public static void main(String[] args) {
		EncryptFile instance;
		try {
			instance = new EncryptFile("!@#$MySecr3tPassw0rd", 16, "AES");
			File file = new File("E:\\plain_text.txt");
			
			try {
				instance.encryptFile(file);
			} catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException
					| IOException e) {
				System.err.println("Couldn't encrypt " + file.getName() + ": " + e.getMessage());
			}
			
/*			try {
				object.decryptFile(file);
			} catch (InvalidKeyException | IllegalBlockSizeException | BadPaddingException
					| IOException e) {
				System.err.println("Couldn't decrypt " + file.getName() + ": " + e.getMessage());
			}*/
		} catch (UnsupportedEncodingException ex) {
			System.err.println("Couldn't create key: " + ex.getMessage());
		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			System.err.println(e.getMessage());
		}
	}


}
