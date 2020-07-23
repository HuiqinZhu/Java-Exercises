
public class Friends {
  String name;       //must define the variable type when mentioning it for the first time
  String goodPoints;
  String weakPoints;
  int age;
  public static int number = 0;
 
  
  public Friends(String name, String goodPoints, String weakPoints, int age) {  
    this.name = name; // this is a class?  
    this.goodPoints = goodPoints;  //the same color, the same attribute and content 
    this.weakPoints = weakPoints;
    this.age = age;     //public Class(variablename name,....){this.name=name;}
    // input in the right, and store the information of input in the left
    number++;   //static attribute update each time for all objects
    System.out.printf("the constructor for %s, the number of friends so far is %d\n", name, number);
  }
  
  
  public String getName() {
	  return name;
  }
  
  public static int getNumber() {  //remember to add static to get static things
	  return number;
  }
  
  
  public boolean isYoung() {  //not known so boolean name()   //boolean can also be a void
	  if(age <50 ) {
		  return true;
	  }
	  else
	  {return false;}   //else{ } can be left out 
	  // using return false directly is ok
  }
  }
