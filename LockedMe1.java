package mypkg;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class LockedMe1
{
	ArrayList<String> list = new ArrayList<String>();
	String name;
	Scanner sc = new Scanner(System.in);

	public LockedMe1()
	{
		this.list = new ArrayList<String>();

		// Adding elements to the ArrayList
        list.add("India.txt");
        list.add("Nepal.txt");
        list.add("Srilanka.txt");
        list.add("USA.txt");
        list.add("Australia.txt");
        list.add("Japan.txt");
	}
	public void retriveasc()
	{      
        Collections.sort(list);  
		
		System.out.println("Files present - Sorted: ");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + " ");
        }
        System.out.println("");
   		display();
   	}

	public void add()
    {
    	System.out.println("Enter file name");
        name =sc.next();
		list.add(name);
		System.out.println("file "+name+ " created.");
		display();
    }
    public void remove()
    {
    	try
    	{
    	System.out.println("Enter file name");
        name =sc.next();
        int index = list.indexOf(name);
        if(index!=-1)
        {
           list.remove(name); 
           System.out.println("file "+name+" removed.");
    	}
        else
        {
        	System.out.println("File not found");
        }
        }
    	catch(Exception e)
    	{    		
    	}
    	finally
    	{
        display();
    	}
    }
    public void search()
    {
    	try
    	{
    	System.out.println("Enter file name");
        name =sc.next();
        int index = list.indexOf(name);
        File f = new File(name);
        if(index!=-1)
        {
             String absolute = f.getAbsolutePath();
             System.out.println("The file "+name+" present at index " + index);
             System.out.println("Path: "+ absolute);
        }
        else
         {
        	System.out.println("File not found");
         }
    	}
        catch(Exception e)
        {
        	
        }
        finally
        {
        	display();
        }
    }
    
    public void display()
    {
    	int i;
    	try 
    	{
    	System.out.println("Menu");
    	System.out.println("1.Retrive files in ascending order");
    	System.out.println("2.Add a new file");
    	System.out.println("3.Delete a file");
    	System.out.println("4.Search a file");
    	System.out.println("5.Display Main menu");
    	System.out.println("6.Exit");
    	i = sc.nextInt();
        ops(i);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Wrong Entry. You can enter a number only.");
    		displaymain();
    	}
    	finally
    	{
    		
    	}
    }
    public void displaymain()
    {
    	int i;
    	System.out.println("Welcome to LockedMe");
        System.out.println("1.Dsplay Menu");
        System.out.println("2.File list");
        System.out.println("3.Exit");
        i=sc.nextInt();
   	
   	switch(i)
   	   {
     	case 1: display();
    	break;
    	case 2:System.out.println("Files list below:");
   	       for (int j = 0; j < list.size(); j++)
          {
              System.out.println(list.get(j) + " ");
          } 
              System.out.println("");
   	          displaymain();
    	break;
   	    case 3: System.exit(0);
    	break;
    	default : System.out.println("Wrong Entry. Please try again");
    	          System.out.println("");
   	              displaymain();
   	   }
    	
    }
    
    public void ops(int i)
    {
    	switch(i)
    	{
    	case 1: retriveasc();
         		break;
         		    
        case 2: add();
        	    break;

        case 3: remove();
        	    break;

        case 4: search();
        	    break;
        	   
        case 5: displaymain();
                break;

        case 6: System.exit(0);

        default: System.out.println("Wrong entry. Please try again");
                 System.out.println("");
                 displaymain();
    	} 
    }
    
    public static void main(String args[]) 
    {
    	LockedMe1 a1 = new LockedMe1();
            a1.displaymain();   	
    }
}