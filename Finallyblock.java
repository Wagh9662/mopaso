package Exception;

import java.util.Scanner;

public class Finallyblock {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=10;
{
     try {
    	 b=a/b;
         } catch(Exception e)
     {
        	 System.out.println("Ex");
     }
           finally 
              {
    	        sc.close();
              }
             System.out.println("end");

		// Chnages made by me
}
}
