import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.io.File;
import java.util.*;


public class javaLearning {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  //define thing user input as the Scanner with the name input //input.nextLine/nextInt/nextDouble/nextBoolean
		
		
		//compare content by equals method and equalsIgnoreCase method, especially for String
		String string1 = "apple";
		String string2 = "Apple";
		if(string1.equals("Apple")) {
			System.out.println("YEAH!");
		}else if(string1.equalsIgnoreCase(string2)) {
			System.out.println("YEAH GREAT!");
		}
		
		
		
		
		
		//to draw more items
		JFrame jj1 = new JFrame("To draw more things!");
		jj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		drawm dd1 = new drawm();
		jj1.add(dd1);
		
		jj1.setSize(500, 500);
		jj1.setVisible(true);
		
		
		
		
		//to select color from color pane
		color color1 = new color();
		color1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//to draw things in java panel and java frame
		JFrame f3 = new JFrame("Title for drawing Graphics");  
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		draw draw1 = new draw();   //add JPanel object in JFrame object
		f3.add(draw1);
		f3.setSize(400, 250);
		f3.setVisible(true);
				
		
		
		
		
		//to change layout 
		layout layout1= new layout();
		layout1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout1.setSize(300, 150);
		layout1.setVisible(true);
		
		
		
		
		//to learn try and catch exception handling
		int xx = 1;
		do {
			try {
				System.out.println("Enter first num: ");
				int xx1 = input.nextInt();
				System.out.println("Enter second num: ");
				int xx2 = input.nextInt();
				int sum1 = xx1/xx2;
				System.out.println(sum1);   //when there is an error, it will jump to the catch part and run by sequence after the catch part
				xx = 2;
			}
			catch(Exception e) {
				System.out.println("Invalid input");
			}
		}
		while(xx == 1);
		
		
		//to read file and print out the content of file
		readFile r1 = new readFile();
		r1.createFile();
		r1.read();
		r1.close();
		
		
		
		//to write to files in another class   //refresh the main folder to see the file and edit the txt file
		file file2 = new file();
		file2.createFile();
		file2.addRecords();
		file2.close();
		
		
		
		
		//to create a new file in java
		final Formatter xx1;     //import java.util.*;  and create final Formatter xx to change String to file
		final Formatter xx2;     //x = new Formatter("fileName or fileAdress");  //file without address will be build inside the workplace by default  
		try {                            //try and catch exception: try{}catch(Exception x){}
			xx1 = new Formatter("yes.txt");
			xx2 = new Formatter("C:\\yes madam.text");
			System.out.println("You created a file");
		}
		catch(Exception ee) {
			System.out.println("You got a erro");
		}
		
		
		//to examine if a file exists on the computer   //do import java.io.File; first  //new File("") means some file which already existed
		File file1 = new File("C:\\test");  //the address should be inside the parenthesis // \ escape or hide the single thing right after it, so always write two backslashes when there are a backslash
		if(file1.exists()) {
			System.out.println(file1.getName() + " exists");   //fileName.exists() is a boolean 
		}else {
			System.out.println(file1.getName() + " doesn't exist");  //fileName.getName()
		}
		
		
		
		
		//to use adapter class to conveniently handle the mouse event
		adapter adapter1 = new adapter();
		adapter1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adapter1.setSize(300, 300);
		adapter1.setVisible(true);
		
		
		
		
		//to respond and change text content when moving the mouse
		
		mouseEvent mouse1 = new mouseEvent();
		mouse1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouse1.setSize(300, 150);
		mouse1.setVisible(true);
		
		
		
		
		//to use list which allows to select multiple values and make the values selected show in another list
		listm list4 = new listm();
		list4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list4.setSize(400, 200);
		list4.setVisible(true);
		
		
		
		
		
		
		
		
		//to use list which allows to select single value and get background changed
		
		list list =new list();
		list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list.setSize(400,150);
		list.setVisible(true);
		
		
		
		
		
		
		
		
		//to use comboBox list and use inner anonymous ItemEvent class
		ComboBox combo1 = new ComboBox();
		combo1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		combo1.setSize(300, 150);
		combo1.setVisible(true);
	
		
		
		
		
		
		//to use radioButton to change the font of the text   //we must create and call things to make things show up
		radioButton radio1 = new radioButton();
		radio1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		radio1.setSize(300, 150);
		radio1.setVisible(true);
		
		
		
		
		
		
		//to use checkBox to change the font of a text
		checkbox checkbox1 = new checkbox();
		checkbox1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		checkbox1.setSize(300, 150);
		checkbox1.setVisible(true);
		
		
		
		
		
		//to use JButton and button with pictures as icon on it and which can change icon when hovered over
		button button1 = new button();
		
		button1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //essential 4 things: import JFrame, setDefaultCloseOperation, setSize, setVisible
		button1.setSize(400, 200);
		button1.setVisible(true);
		
		
		
		
		
		//to loop over polymorphism
		animal[] animal1 = new animal[2];
		
		dog dog3= new dog();
		fish fish2 = new fish();
		
		animal1[0] = dog3;
		animal1[1] = fish2;
		
		for(animal aaa : animal1) {
			aaa.noise();  //aaa already stands for an element inside an array or container
		}
		
		
		
		
		
		//to build even more convenient program to hold more objects
		animalList list2 = new animalList();

        fish fish1 = new fish();  //because either fish or dog extends the animal class, their objects can be interchangeable with animal parameters
        dog dog2 = new dog();
        
        list2.add(fish1);
        list2.add(dog2);
		
		
		
		
		
		
		
		
		//to build class to hold objects
		dogList list1 = new dogList();
		dog dog1 = new dog();
		
		list1.add(dog1);
		
	
		
		
		
		
		/*overriding rules and abstract or concrete class or method:
		 *  methods overrode should have the same parameter(even when the parameter is none) and the same type of return values and the same scope(public or private)
		so that they can be interchangeable at any time
		general superclass that is not suitable to create interchangeable methods should be abstract so that no object of it can be created: abstract public class xxx
		we can make the superclass only for polymorphism and inheritance
		 
		 we have have the parameter as int i, but it becomes overloaded not overriden and it won't be inherited 
		 
		 abstract and concrete: concrete is the default value, means we can create objects of it
		 
		 we can also make a method abstract, but it must leave out the body, should be inside an abstract class, and the subclass must override that abstract method
		*/
		food food1 = new apple();  //yet we can still create abstract class object by assigning it to its subclass 
		
		
		
		
		
		//to use a polymorphic array
		Chef[] chef1 = new Chef[3];
		
		chef1[0]=new badChef();
		chef1[1]= new GoodChef();
		chef1[2]= new Chef();
		
		for(Chef chef : chef1) {  //for every element x of type z in container y 
			chef.makeDessert();
		}
		
		
		
		//to build an event handler program with JFrame, ActionListener, ActionEvent, actionPerformed //must import javax.swing.JFrame first
		window window1 = new window();
		
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window1.setSize(300,100);
	    window1.setVisible(true);
		
		
		
		
		//to build GUI with JFrame   //import javax.swing.JFrame first and build a new object and set default close operation, size and visible
		tuna bucky = new tuna();
		
		bucky.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //objectName.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		bucky.setSize(275, 180);  //objectName.setSize(width, height)
		bucky.setVisible(true);  //objectName.setVisible(ture)
		
		
		
		
		//to use GUI aka graphical user interface and import javax.swing.JOptionPane   //JOptionPane.showInputDialog("")  //JOptionPane.showMessageDialog(null, "" + , "titleName", iconExample)
		String s1 = JOptionPane.showInputDialog("Enter first number");
		String s2 = JOptionPane.showInputDialog("Enter second number");
		
		int i1 = Integer.parseInt(s1);   //Interger.parseInt()   //all the input should be parsed to be int
		int i2 = Integer.parseInt(s2);
		int multiply = i1 * i2;
		
		JOptionPane.showMessageDialog(null, "multiply =" + multiply, "the operation result", JOptionPane.PLAIN_MESSAGE);  //JOptionPane.PLAIN_MESSAGE
		
		
		//to build subclass which extends(inherits) superclass and override some methods  //attention that only public methods can be inherited
		GoodChef c1 = new GoodChef();  //class 1 can extends class 2, and class 2 can extends class 3
		c1.makeMeat();
		c1.makeRice();
		
		
		
		//to use final in class  //only be able to give the value of final attribute once
		Book b1 =new Book(10);
		
		for(int bb=0; bb<10; bb++) {
			b1.add();
			System.out.printf("%s\n", b1);  //print out the object directly and it will print out the toString method of the object 
		}
		
		
		
		
		//to use static in class
		
		Friends f1 = new Friends("kelly", "outgoing", "short", 20);  //just build a new object and run the program
		Friends f2 = new Friends("kyle", "wise", "shy", 20);  
		
		
		//to use more static
		System.out.println(f1.getName() + "\t" + f1.getNumber());
		System.out.println(Friends.getNumber());   //we can write className.staticMethod directly
		 
		
		//to use enumeration class and its object
		for(language object : language.values()){   //language whateverYouCallTheObject : language.values()   //className.values() is a number?
			System.out.printf("%s\t%s\t%s\n", object, object.getDisc(), object.getSequence()); 
		}
		 
		//to import and use Enumset.range( , )    //import java.util.EnumSet   language.object :EnumSet.range(language.objectName, language.objectName)
		for(language object : EnumSet.range(language.English, language.Spanish)) {   //EnumSet.range( , ) might be a number range?
			System.out.printf("%s\t%s\t%s\n", object, object.getDisc(), object.getSequence());
		}
		

		
		
		//to refer to and use value of object in other class, by using toString method and composition
		OtherClass o7 =new OtherClass(11, 11, 11);
		girl girl3= new girl("heilly", o7 );
		
		System.out.println(girl3);
		
		//to use toString method and print out things each time when creating a new classObject
		OtherClass o5 = new OtherClass(5, 6);
		OtherClass o6 = new OtherClass(7, 7 ,7);
		
		
		
		//to build multiple constructors and setters and getters and use their objects through them in main area
		OtherClass o1 = new OtherClass();
		OtherClass o2 = new OtherClass(12);
		OtherClass o3 = new OtherClass(3, 45); 
		OtherClass o4 = new OtherClass(2, 4, 5);
		
		
		o1.display();
		o2.display();
		o3.display();
		o4.display();
		
		System.out.printf("%s\n", o1.getName());  //prinf is always with "%s"(format) and the method(args) // \n means next line
		
		//public, private and this:  this means classObject  need to be used when name the variable name as the attribute name of the class, or the computer will be confused
		
		//to build a time class and display time in military format
		OtherClass time = new OtherClass();
		
		time.display(); //the default setting of value is 0
		
		time.setTime(15, 56, 28); //item which breaks the rule will be returned to the default value 0
		time.display();
		
		//to display time in regular format
		time.regularDisplay();
		
		
		//to use array-like variables but not array and use the length method of it
		System.out.println(average(1, 3, 3, 4,5));//methods returned should be printed out to be seen //the result of int operation will be int
		
		
		
		
		//to build a multidimensional array and build a table of it with nested for loop
		int[][] multidimensional = {{1, 33, 44}, {223}, {4,66, 77, 89}};
		
		display(multidimensional);
		
		
		//to use array in methods and change array with methods
		double[] p = {2.3, 3.4, 5.5, 3.6};
		
		change(p);  //build methods aside from the main area
		
		for(double s : p) {
			System.out.println(s);
		}
		
		//to sum up the values in an array using an enhanced for loop
		int[] m = {2 ,22, 44, 55, 66, 88};
		int n = 0;
		
		for(int o: m) {   //type, variable name, : , and the array name  //what type of value with the name of what in which array  
			n += o;
		}
		
		System.out.println(n);
		
		//to take counter of dice as elements in array 
		Random k = new Random();
		int[] l = new int[7];
		
		for(int roll=0; roll < 1000; roll++) {
			++l[1 + k.nextInt(6)];  //the default value of items in array is 0. And by ++ each time the item showed up, the value will increment by 1
		}
		
		System.out.println("face\tcounter");
		
		for(int face = 0; face<l.length;face++) {
			System.out.println(face + "\t" + l[face] );
		}
		
		
		//to sum elements in array
		double[] number = {1, 3, 4, 5, 4.5};
		double sum1 = 0;
		
		for(int j = 0; j< number.length; j++) {
			sum1 += number[j];
		}
		
		System.out.println("The total number of this array is " + sum1);
		
		
		//to create a table using array
		System.out.println("index\tvalue");
        
		String friends [] = {"Jack", "Rose", "Books"};
		
		for(int i = 0; i < friends.length; i++ ) {   //because index of array starts at 0 
			System.out.println(i + "\t" + friends[i]);  // "\t" means 5 spaces?
		}
		
		
		//to create an array and use index
		int[] h = new int[8];
		
		h[0]=1;
		h[2]=3;
		
		System.out.println(h[0]);  //always remember to write how many items there are when creating array in this way
		
		
		String[] fruit = {"apple", "banana", "peach"};
		
		fruit[2]="orange";
		
		System.out.println(fruit[0]);
		System.out.println(fruit[2]);
		
		
		//to use random number generator
		Random dice = new Random();
 
		
		for(int f = 1 ; f <= 8; f++) {  //must define the variable type int first in the for loop 
			System.out.println(dice.nextInt());
		}
		
		int num ;
		for(int g =1 ; g <=10 ; g++) {
			num = dice.nextInt(10) + 1;
			System.out.println("Round " + g + "    " + num);
		}
		
		
		
		//to use math class methods   //abs ceil floor max min pow sqrt
		System.out.println(Math.abs(-0.9));  //absolute is how much it is away from 0  //ceil and floor is the integer right up or down the number
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.floor(3.4));
		System.out.println(Math.max(-0.9, 8));
		System.out.println(Math.min(3 , 9));
		System.out.println(Math.pow(4, 5));
		System.out.println(Math.sqrt(25));
		
		
		
		
		//to use a do-while loop
		int e = 10;
		do {
			System.out.println(e);
			e++;
		}while( e < 10);    //print ; after the do-while loop 
		
		
		
		
		//to build a compound interest program using for loop
		double principal = 60000;
		double rate = 0.09;
		double amount;
		
		for(int year = 1; year <= 6; year++) {   
			amount= principal* Math.pow((1 + rate), year);   //use Math.pow( , ) directly
			System.out.println(year + "   " + amount);
		}
		
		for(int year = 1; year <=6; year++) {
			principal = principal * (1 + rate);     //use a = a * b indirectly
			System.out.println(year + "   " + principal);
		}
		
		
		
		//to use a for loop
		for(int d=6; d <=100; d*=3) {  //3 values inside the for loop parameters: variable type and initial value(where to start), where to end, increment everytime
			System.out.println(d);
		}
		
		
		
		//to build a basic average calculator
		int grade;
		int total = 0 ;
		int counter = 0;   //++  or + need to have a initial value
		int average;
		
		while(counter < 10) {
			grade = input.nextInt();  //when the input is int, type .nextInt()
			total = total + grade;  //to add up all outcomes of each loop 
			counter++;  //++ to limit the running time of the loop 
		}
		
		average = total / 10;
		System.out.println("You average is " + average);
		
		
		//to use conditional operator to substitute for if statement sometimes
		String sex = "female";  //System.out.println(  ?  "" : "")
		System.out.println(sex=="female"? "You are a female human being but sex or gender never matters" : "You might be a male human being or others but that doesn't matter");
		
		
		//to use else if statement
		String sexualOrientation = "asexual";           //make a condition to be tested first
		if(sexualOrientation == "heterosexasual") {     //use == != to make String variable equal to something
			System.out.println("You are a heterosexual");
		}else if(sexualOrientation == "asexual") {    
			System.out.println("You are an asexual");
		}else if(sexualOrientation == "homosexual") {
		    System.out.println("You are a homosexual");
		}else{
			System.out.println("You might be a transexual or something else");
		}
		
		int age2 = 24;
		if(age2 >= 40) {
			System.out.println("You might be in your middle age or senior age");
		}else if(age2 >= 30 ) {
			System.out.println("You are in your 30s");
		}else if(age2 >= 20) {
			System.out.println("You are in your 20s");
		}else {
			System.out.println("You are a teenager or child now");
		}
		
		
		
		//to use nested if statement
		int age1 = 50;
		if (age1 > 100) {  //test the condition and execute and test the condition inside it and continue to execute
			System.out.println("You must experienced a lot of the world!");
		}else {
			System.out.println("You still can experience a lot of the world!");
			if(age1 <= 50) {
				System.out.println("Oh, you are sooo young! There are so much of the world for you to see and explore!!!");
			}else {
				System.out.println("Oh, you are still young! Go ahead and keep exploring the world!!!");
			}
		}
		
		
		//to use constructor in another class
		girl girl1 = new girl("Wu", o4);  //we need to use constructors if we created constructors in the class where it is from
		girl1.saying();
		
		girl girl2 = new girl("Luis", o4);
		girl2.saying();
		
		
		
		//to use multiple methods and instance variable
		OtherClass d = new OtherClass();
		
		System.out.println("Enter the name of boy who you had crush on: ");
		String boyName = input.nextLine();
		
		d.setName(boyName);  //don't add quotation marks if it is variable name, not a String //if you add quotation marks, then it prints exact that 
		
		d.saying();
		
		
		
		//to use method from another class with parameters
		OtherClass sayhi = new OtherClass();
		
		System.out.println("Enter your name: ");  
		String name1 = input.nextLine();   //store one input as the value for parameter variable
		
		sayhi.message1(name1);
		
		
		
		
		//to use method from another class without parameters
		OtherClass sayHi = new OtherClass();   //create a object of another class to use all kinds of methods in that class
		sayHi.message();   //and all methods can only be executed in the void main 
		
		
		
		
		//to create a while loop
		int c = 1;
		while(c<9) {
			System.out.println(c);   //while loop is a loop, not a statement  //always put increments or it will loop forever
			c++;
		}
		
		
		
		//if statement and logical operators: if(){}else if(){}else{}  
		//&&double ampersand   ||pipe lines
		
		
		//to use increment calculator
		int a =1;
		System.out.println(a++);  // ++ coming after is handled in the next line and  ++ coming before is handled in just that line 
		System.out.println(++a);
		a *= 7;       // more convenient to use += -= *= /= %=   no need to type 2 names of the variable
		a = a + 9;
		System.out.println(a);
		
		//to make a basic calculator
		double fnum, snum, answer;   //we can define multiple variables at the same time, use the same variable type and ,
		
		System.out.println("Enter your first number: ");
		fnum = input.nextDouble();
		System.out.println("Enter your second number: ");
		snum = input.nextDouble();
		
		answer = fnum + snum;
		System.out.println(answer);
		
		
		//to print out input directly
		System.out.println(input.nextLine());
		
		
		//to differentiate between print and println
		int money;        //define the type of variable is always the first important thing
		money = 1000000000;
		System.out.print("I want ");
		System.out.print(money);
		System.out.println(" dollars");  //println put next line in another line, not itself
		System.out.print("Yeah right!");
		
		
		
		//to use void in other class or things besides main void
		
		GoodChef b = new GoodChef();  //create preconditions of Scanner and newObject -- create parameters from input -- execute
		
		System.out.println("Enter the name of a good chef");
		String name = input.nextLine();
		
		b.message(name);
		
		
		
		sayhi1();    //when it is in the same file, only call the static method   //call the method in the same file by just calling it and don't forget the ()
	    sayhi2("Hope");  //always add "" when it is a String    
	    
	    
	    
	    
		
		//to use switch loop instead of if loop for multiple circumstances
		@SuppressWarnings("resource")
		
		int age = input.nextInt() ;    //define variables //switch(){case :  ;break;case : ;break;default: ;break;}
		switch(age) {
		case 1:
			System.out.println("you can crawl");
			break;
		case 2:
			System.out.println("you can talk");
			break;
		case 3:
			System.out.println("you can get into trouble");
			break;
		default:
			System.out.println("I don't know your age");
			break;
		}
		
	
		
		
		
		}
		
		
	public static void sayhi1() {
		System.out.println("hello dear");
	}
		
	public static void sayhi2(String name) {   //always need a variableDeclaratorId in parameter, except when it is inside switch loop 
		System.out.println("hello, dear " + name);
	}
	
	public static void change(double[] q) {
		for(int r = 0; r < q.length; r++) {
			q[r] *= 7;
		}
	}
	
	public static void display(int [][] t) {
		for(int row = 0; row< t.length; row++) {
			for(int column = 0; column < t[row].length; column++) {
				System.out.print(t[row][column] + "\t");
			}
			System.out.println();
		}
	}
	
	
	public static int average(int...x) {   //int/double/String...name 
		int sum = 0;
		for(int y : x) {  //{}here can be left out?  
			sum += y;
		}
		return sum/x.length;
	}
	
	}
	
	
	
	
	
	
	


