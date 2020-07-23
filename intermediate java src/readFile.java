import java.util.*;
import java.io.*;    //import java.util/io.*;



public class readFile {

	private Scanner x;   //Scanner can not only get input from the user's screen, but also get a file // Scanner can also be a variable
	
	public void createFile() {
		try {
			x = new Scanner(new File("Chinese.txt"));  //x = new Scanner(new File(" "));
		}
		catch(Exception e) {
			System.out.println("could not find the file");
		}
	}
	
	public void read() {
		while(x.hasNext()) {   //x.hasNext()  
			String a = x.next();
			String b = x.next();   //x.next
			String c = x.next();
			
			System.out.printf("%s %s %s\n", a, b, c );
		}
	}

	public void close() {
		x.close();
	}
}
