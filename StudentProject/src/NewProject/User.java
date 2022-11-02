package NewProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class User extends Operations {
	
	String name,setype,ac,contact,pass;
	  float amount;
	  String amnt;
	  Scanner scanner=new Scanner(System.in);
      char scnumber[]=new char[6];
      char pin[]=new char[5];
      
      
      public void NewUser()
      {
    	  int c=0;
    	  String line;
    	  String lread;
    	  char nm[]=new char[6];
    	  
    	  System.out.println("\t\tEnter Your Details\n");
    	  System.out.println("--------------------------------------------------------");
    	  
    	  try
    	  {
    		  PrintWriter outs=new PrintWriter(new FileWriter("userdetails.txt",true));
    		  BufferedWriter bw=new BufferedWriter(new FileWriter("statement.txt",true));
    		  
    		  do
    		  {
    			  c=0;
    			  System.out.println("Please Enter Your Full Name :");
    			  name=scanner.nextLine().trim();
    			  
    			  if(name.length()<3)
    			  {
    				  System.out.println("\n---Name Shouls be Greater than 2-Charecters");
    			  }
    		  }
    		  
    	  }
      }
}
