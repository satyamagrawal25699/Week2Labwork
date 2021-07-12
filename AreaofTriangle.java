package knitingale;
import java.util.Scanner;

public class AreaofTriangle {
      public static void main(String[] arg)
      {
    	 double height;
    	 double base;
    	 double Area;
    	 Scanner reader=new Scanner(System.in);
    	  
    	  System.out.println("Enter The values of Base and Height");
    	  base=reader.nextDouble();
    	  height=reader.nextDouble();
    	  
    	  Area=(base * height)/2;
    	  
    	  System.out.println("The  Area of Triangle is  "+Area);
    	  
    	  
    	 
    	  
    	  
      }
}
