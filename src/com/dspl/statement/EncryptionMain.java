package com.dspl.statement;
import java.util.Scanner;

public class EncryptionMain {

	public static void main(String[] args) 
	{	
		Scanner input=new Scanner(System.in);
		Encryption encrypt=new Encryption();
		String msg;
		
		
		System.out.println("Please Enter your Text here...\n");
		msg=input.nextLine();
		
		//key should less than <24
		System.out.println("Please enter your key to Encrypt the messege");
		int key=input.nextInt();
		
		String encrypt_msg,decrypt_msg;
		
		encrypt_msg=encrypt.getEncryptedMsg(msg,key);
		
		System.out.println("Your encrypted text is..\n"+encrypt_msg);
		System.out.println("Your decrypted text is..\n"+encrypt.getdecryptedMsg(encrypt_msg,key));
		
		
		input.close();
	}

}
