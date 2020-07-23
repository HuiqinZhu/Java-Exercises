
public class girl {
private String girlName;
private OtherClass wakeUpTime;

public girl(String name, OtherClass wakeUpTime) {  //use constructor so that we can initiate variables as soon as an object is created //and do define variable types
	this.girlName = name;
	this.wakeUpTime = wakeUpTime;
}

public String toString() {
	return String.format("the girl %s wake up at %s", girlName, wakeUpTime);   //toString method will be printed out
}

public void setName(String name) {
	girlName = name;
}
public String getName() {
	return girlName;
}
public void saying() {
	System.out.printf("I fancy girls such as %s", getName());
}
}
