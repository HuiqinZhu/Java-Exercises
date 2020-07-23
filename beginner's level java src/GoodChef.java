
public class GoodChef extends Chef{ //can extend from other class  //just add 2 characters:extends x
	
	
    //can override to make old content new
	public void makeDessert() {
		  System.out.println("make a delicious cake");	
}
	//can add some special content
	public void makeRice() {
		  System.out.println("make healthy rice");
	}
	
	public void message(String name) {
		 System.out.println(name + " is a good chef");
	}
}