package IOPractice;

import java.io.FileNotFoundException;

public class FileApplication 
{
	public static void main(String []args)
	{
		FileOperation f1=new FileOperation();
	
		try
		{
			f1.createFile();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		f1.writeFile();
		f1.fileRead();
	}
}
