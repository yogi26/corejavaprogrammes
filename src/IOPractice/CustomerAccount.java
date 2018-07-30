package IOPractice;

public class CustomerAccount 
{
	public String cust_name,cust_addr,acc_no;
	
	public CustomerAccount()
	{
		String str=new FileRead().readFile();
		String str1[]=str.split("\n");
		
		this.cust_name=str1[0];
		this.cust_addr=str1[1];
		this.acc_no=str1[2];
	}
	public void showCustomer()
	{
		System.out.println("Name     :"+cust_name);
		System.out.println("Address  :"+cust_addr);
		System.out.println("Acc No   :"+acc_no);
	}

}
