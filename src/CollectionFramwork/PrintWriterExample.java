package com.CollectionFramwork;
import java.io.File;  
import java.io.PrintWriter;  

public class PrintWriterExample 
{

	    public static void main(String[] args) throws Exception
	    {  
	             
	      PrintWriter writer = new PrintWriter(System.out);    
	      writer.write("Hello World...!");         
	      writer.close();  
	       
	      PrintWriter writer1 =null;      
	      writer1 = new PrintWriter(new File("F:/Demo.txt"));  
	      writer1.write("Like Java, Spring, Hibernate, Android, PHP etc. 55555555555555555555555555555555555555555555555555555");                                            
	      writer1.close();  
	    }  
}  