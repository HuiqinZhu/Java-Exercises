import java.util.*;   //import  java.util/lang/io.*;
import java.io.*;
import java.lang.*;



public class file {

	private Formatter x;   //make it a variable so that it can be used through out the class  //use Formatter when you just want to create and write a file and use Scanner when you want to create and read a file
	
	public void createFile() {
		try{
			x = new Formatter("Chinese.txt");    // = new Formatter(" ");  to build a new file  //and always use try and catch?
		}
		catch(Exception e) {
			System.out.println("You got an error");
		}
	}
	
	public void addRecords() {
		x.format("%s %s %s\n", "20", "Hope", "CS");  //fileName.format(); to add content to file
		x.format("%s %s %s\n", "21", "Hope", "CS");
		x.format("%s %s %s\n", "22", "Hope", "CS"); 
		
		
	}
	
	public void close() {
		x.close();     //fileName.close(); to always close a file after creating or using it
	}
	
}
