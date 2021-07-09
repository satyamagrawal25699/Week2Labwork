package knitingale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args)
    {
    	Scanner reader=new Scanner(System.in);
    	System.out.println("Enter a Number ");
    	
    	int number=reader.nextInt();
    	if(number%2==0)
    	{
    		System.out.println("Number is Even ");
    	}
    	else
    	{
    		System.out.println("Number is Odd ");
    	}
    }
}
