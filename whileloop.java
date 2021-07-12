package knitingale;
import java.util.Scanner;

public class whileloop {
  public static void main(String[] args)
  {
	  int number,sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Please Enter the value below 10");
	  
	  number=sc.nextInt();
	  
	  while(number<=10)
	  {
		  sum=sum+10;
		  number++;
	  }
	  System.out.format("The value obtained in loop is %d",sum);
  }
}
