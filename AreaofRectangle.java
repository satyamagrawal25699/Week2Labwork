package knitingale;
import java.util.Scanner;

public class AreaofRectangle {
  public static void main(String[] args)
  {
	  double length;
	  double breadth;
	  double Area;
	  Scanner reader=new Scanner(System.in);
	 System.out.println("Enter length and Breadth of the Rectangle");
	  
	  length=reader.nextDouble();
	  breadth=reader.nextDouble();
	  
	  Area=length*breadth;
	  
	  
	  
	  System.out.println("Enter length and Breadth of the Rectangle "+(int)Area);
	  
	  
	  
	  
  }
}
