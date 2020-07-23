
public class OtherClass {
	private String boyName;  //private means only public in current class   //variable besides voids but inside the class is called instance variables
	private int hour;
	private int minute;
	private int second;
	
	public OtherClass(int h, int m, int s) {
		setTime(h, m, s); //we can also put a method inside a constructor
		System.out.printf("The time form of these numbers might be %s\n", this);  //use this to refer to classObject and its form and its toString method
	}   //and the args should be String methods that return things, not void methods print out things!
	//the \n  is very very useful  
	
	
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public OtherClass() {    //build multiple constructors to deal with multiple input by users //this( , ) is very convenient
		this(0, 0, 0);
	}
	
	public OtherClass(int h) {  //is ok to have the same parameters????
		this(h, 0, 0);
	}
	
	public OtherClass(int h, int m) {
		setTime1(h, m);
		System.out.printf("The date form of these numbers might be %s\n", dateFormatter());
	}
	
	public String dateFormatter() {
		return String.format("%d/%d", hour, minute);
	}
	
	public void setTime1(int h, int m) {
		hour = ((h <= 24 && h >=0)? h : 0);
		minute =((minute <= 60 && minute >=0 )? m : 0);
	}
	
	public void setTime(int h, int m, int s) {  //make setters to make sure the attribute set being filtered
		setHour(h);   //we can put methods inside a method
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h) {
	    this.hour=((h <= 24 && h >= 0)? h: 0);  // much more convenient than if statement  //this. means the calling attribute of classObject
	}
	
	public void setMinute(int m) {
	minute =((m <= 60 && m >=0)? m : 0);
	}	
	
	public void setSecond(int s) {
		second = ((s <=60 && s >= 0)? s:0);
	}
	
	public int getHour() {
		return hour;     //this is for all hour that value is assigned 
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {   //make getters to make sure we get the attribute value we filtered in the setters
		return second;
	}
	
	
	public void display() {
		System.out.println(String.format("%02d:%02d:%02d", getHour(), getMinute(), second)); //String.format("%02d:%02d:%02d", , ,)  2 decimals after 0
	}
	
	
	public void regularDisplay() {
		System.out.println(String.format("%d:%02d:%02d %s", (hour == 12 || hour ==0)? 12: hour%12, minute, second, (hour <= 12? "AM":"PM")));
	}   //be careful about the numbers of parenthesis  //the implement of ? :  //insert () appropriately so that computer can understand   //%s there are always reason for things
	
	public void setName(String name ) {   //void means method that doesn't need to return something
		boyName = name;         
	}
	
	public String getName() {  //public means be able to access from anywhere  //String means method which returns String
		return boyName;       
	}
	
	public void saying() {
		System.out.printf("The handsome boy might be %s", getName());   //System.out.printf("  %s", x());
	}
	
    public void message() {
    	System.out.println("Hi, I'm from another class");
    }
    
    public void message1(String name) {     //have to define the variable type of the parameters
    	System.out.println("Hi, " + name + " ! I'm from another class");
    }
}
