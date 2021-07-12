package knitingale;
import java.util.Scanner;


public class AreaOfCircle {
     public static void main(String [] args)
     {
    	 double radius;
    	 double Area_Of_Circle;
    	 
    	 Scanner reader=new Scanner(System.in);
    	 System.out.println("Enter The Value of Radius");
    	 radius=reader.nextDouble();
    	 
    	 Area_Of_Circle=3.14*(radius*radius);
    	 
    	 
    	 System.out.println("Area Of Circle is " +Area_Of_Circle);
    	 
    	 
    	 
     }
}
