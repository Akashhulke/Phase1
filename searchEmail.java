import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class searchEmail
{
	String emailID;
	ArrayList<String> emails = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	
	public void emailList()
	{

        emails.add("akash.hulke@gmail.com");
        emails.add("riki.joshi@yahoo.com");
        emails.add("shahruk.khan@outlook.com");
        emails.add("akshay.kumar@outlook.com");
        emails.add("xyz.pqr@yahoo.com");
        emails.add("abc.pqr@gmail.com");
        emails.add("prakash.hulke@outlook.com");
	   
	    System.out.println("Enter your email ID");
	    emailID = sc.nextLine();
		int index = emails.indexOf(emailID);
		File f = new File(emailID);
		
		
		{ 
		if (emailID.contains("@") && emailID.contains(".com"))
		{          
             if(index!=-1)
                {
                   System.out.println("email found");
                   
                }
             else
                {
        	       System.out.println("email not found");
        	       
                }
		}
		else
		{
			if(emailID.equals("stop"))
			{
				System.exit(0);
			}
			else
			{
			System.out.println("Please enter correct email address or enter 'stop' to exit.");	
			emailList();
			}
		}
	}
}
	public static void main(String ars[]) 
	{
		searchEmail e = new searchEmail();
		e.emailList();
	}
}