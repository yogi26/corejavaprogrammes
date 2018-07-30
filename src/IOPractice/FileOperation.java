package IOPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOperation 
{
	FileInputStream in;
	FileOutputStream out;
	
	public void createFile() throws FileNotFoundException
	{
		out=new FileOutputStream("C:/Users/HP/Desktop/JavaFiles/abc.txt",true);
	}
	
	public void fileRead()
	{
		try 
		{
			in=new FileInputStream("C:/Users/HP/Desktop/JavaFiles/abc.txt");
			while(true)
			{
				char ch;
				ch = (char)in.read();
				if(ch==-1)
				{
					break;
				}
				else
				{
					System.out.print(ch);
				}
			}

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void writeFile()
	{
		String s="I am indian";
		for(int i=0;i<s.length();i++)
		{
			try
			{
				out.write(s.charAt(i));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}	
