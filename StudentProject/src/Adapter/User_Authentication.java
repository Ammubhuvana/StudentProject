package Adapter;

import java.util.Scanner;
	public class User_Authentication 
	{
	    public static void main(String args[])
	    {
	        String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Alexa");//username:user
	        username = s.nextLine();
	        System.out.print("coded123");//password:user
	        password = s.nextLine();
	        if(username.equals("Alexa") && password.equals("coded123"))
	        {
	            System.out.println("True");
	        }
	        else
	        {
	            System.out.println("False");
	        }
	    }
	}


