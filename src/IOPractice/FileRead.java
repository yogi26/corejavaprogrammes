package IOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead 
{
	FileInputStream fin;
	public String readFile()
	{
		String str=new String();
		try
		{
			fin=new FileInputStream("C:/Users/HP/Desktop/JavaFiles/account.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		int ch;
		StringBuilder s=new StringBuilder();
		try
		{
			while((ch=fin.read())!=-1)
			{
					s.append((char)ch);
			}
			str=s.toString();
			
		}
		catch (IOException e) 
		{
			System.out.println("Error in file reading");
			e.printStackTrace();
		}
		
		return str;
		
	}
	
}
