//Assignment for Application Developer Applicant for Password Authentication Module.
//By Shubham Sharma, JIIT Noida Sec-62
//Enrollment No. 15102254

import java.util.*;
public class Password_Authentication {
	 String pass;
	public static void main(String args[])
	{
		System.out.println("Enter a sequence of comma separated passwords:");
		//For example: "12sdA@83,aF1#,2w3E*%dg,2We3345,1234567"
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		

        StringTokenizer token = new StringTokenizer(pass, ",");
        
        while (token.hasMoreTokens()) {
            validate(token.nextToken());
        }        
	}
	
	public static void validate(String pass)
	{
			boolean value = true;
			
            if (pass.length() > 12)
            {
                    System.out.println(pass+" "+"Failure Password must be atmax 12 characters long.");
                    value = false;
            }
            
            else if (pass.length() < 6)
            {
                    System.out.println(pass+" "+"Failure Password must be atleast 6 characters long.");
                    value = false;
            }
            
            
            else if (!pass.matches(".*[a-z]{1,}.*"))
            {
                    System.out.println(pass+" "+"Failure Password must contain atleast one letter from a-z.");
                    value = false;
            }
            
            
            else if (!pass.matches(".*[A-Z]{1,}.*"))
            {
                    System.out.println(pass+" "+"Failure Password must contain atleast one letter from A-Z.");
                    value = false;
            }
            
            
            else if (!pass.matches(".*[0-9]{1,}.*"))
            {
                    System.out.println(pass+" "+"Failure Password must contain atleast one number from 0-9.");
                    value = false;
            }
            
            
            else if (!pass.matches(".*[*$_#=@]{1,}.*"))
            {
                    System.out.println(pass+" "+"Failure Password must contain atleast one character from *$_#=@.");
                    value = false;
            }
            
            
            else if (pass.matches(".*[%!)(]{1,}.*"))
            {
                    System.out.println(pass+" "+"Failure Password cannot contain %!)(.");
                    value = false;
            }
            
            else if (value)
            {
                    System.out.println(pass+" "+"Success");
            }
            
            /*Note: To print all reasons of failure altogether for a particular password, 
            we can use only if conditions in place of if-else.*/
	}
	

}
