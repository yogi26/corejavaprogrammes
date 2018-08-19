package PracticeTest;
import java.io.IOException;
import java.util.*;
import IOPractice.FileRead;
public class FileData 
{
	public static void main(String[] args)throws IOException 
	{
		FileRead f=new FileRead();
		String str=f.readFile();
		String s[]=str.split(" ");

		List listObj=new ArrayList();
		List arrListObj=new ArrayList();
		Set setObj=new LinkedHashSet();
		
		for(int i=0;i<s.length;i++)
		{
			listObj.add(s[i]);
			setObj.add(s[i]);
			arrListObj.add(s[i]);
		}
		System.out.println("No of words available in file  : "+listObj.size());
		System.out.println("------------------------------------");
		System.out.println("No of unique words             : "+setObj.size());
		System.out.println("------------------------------------");
		System.out.println("No of Occurences for each word : ");
		
		HashSet hs=new HashSet();
		for(int j=0;j<arrListObj.size();j++)
		{
			hs.add(arrListObj.get(j));
		}
		Iterator itr=hs.iterator();  
		while(itr.hasNext())
		{
			String str1=(String)itr.next();
			System.out.println(str1+" "+Collections.frequency(arrListObj, str1));
		}
		System.out.println("--------------------------------------");
		
	}

}




