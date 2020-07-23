import java.util.Scanner; //import java.util.Scanner; import java.util.Scanner;

public class MySweetProgram { //class   //who can execute by "public" or "private"
	 //culy braces:content of class or method
     //indent:just by convention
	public static void main(String[] args) { // member  //method
     System.out.println("Hello there!"); //statement  class.member.method   dot to execute
     System.out.println("Hello there 2!");
     
     System.out.println("     /|");  // System.put.println();
     System.out.println("    / |");  // executed line by line
     System.out.println("   /  |");
     System.out.println("  /___|");
     
     String name = "David"; // String needs ""
     int age = 80;
     System.out.println("I like a boy called " + name + ". I hope he long lives to the age of " + age + ".");
 
     
     name = "Mike"; // !!!! rename the variable by not mentioning the type of variable!!!
     
     System.out.println("And this boy doesn't like his name. He changed his name to " + name + ".");
     
     
     String faculty = "Computer science";// String "", char '', double, int, boolean
     char gpa = 'a';
     int weight = 90;
     double height = 152.8;
     boolean isFemale = true;
     System.out.println(isFemale);
     System.out.println("science");
     System.out.println('a');    // print directly. Whether or not with the quotation marks is the same with the operation indirectly
     System.out.println(153);
     System.out.println(true); 
     
     
     
     // comparison: >  >=  <  <=  ==  !=  
     // &&(and)  ||(or)  ()
     int l = 7;
     int m = 90;
     String j = "sad";
     String o = "happy";
     boolean co = j != o;
     boolean com = (l < m && l >= 6) || (l + 90 >= m)  ;
     System.out.println(co);
     System.out.println(com);   //boolean name can = condition, and the output would be true or false depending on the information provided
     
     
     System.out.println("she is beautiful.\nVery beautiful.");   // \n  \\   not /
     System.out.println("she is beautiful.\\ beautiful and kind and smart.");
     System.out.println("she is very \"beautiful\".");
     System.out.println("she is beautiful."
    		               + " Very beautiful.");    // "" +""
     
     // string with variables and methods(functions)
     String phrase = "my Love and my Passion and my Life and the World";
     System.out.println(phrase.toUpperCase());
     System.out.println(phrase.toLowerCase());
     System.out.println(phrase.contains("boyfriend")); //boolean functions can be used inside the methods
     System.out.println(phrase.length());
     System.out.println(phrase.charAt(0));       //start with 0
     System.out.println(phrase.indexOf("Love"));
     System.out.println(phrase.indexOf('W'));  // contents except number and variable and function should be with quotation marks
     System.out.println(phrase.lastIndexOf("my")); //some methods should be added with contents inside the quotation marks, some shouldn't
       // indexOf --- the first time when the character appears
       // lastIndexOf --- the last time when the character appears
     System.out.println(phrase.substring(0, 5));   // substring of String  x.substring(num1, num2)   not []
     System.out.println(phrase.substring(0, phrase.indexOf(" "))); // method can be used inside methods, but be careful about the numbers of quotation marks
       // the method of grabbing the first word-----phrase.substring(0, phrase.indexOf(" "))
       //extraction of the first word---- System.out.println(x.substring(0, x.indexOf(" ")))
     
     
     int num1 = 3;
     double num2 = 5.0; 
     System.out.println(5 + 3);
     System.out.println(5 * 3);
     System.out.println(num1 - num2); // any operation used the double number will end up with double number
     System.out.println(num1 / num2);
     System.out.println(3 / 5);  // integer and integer will end up with integer, even ignore the accurate operation
     System.out.println(num2 % num1); 
     System.out.println(Math.pow(num1, num2));   //mention the calss of Math--- Math.method(number)
     System.out.println(Math.sqrt(num1));
     System.out.println(Math.abs(num1 - num2));
     System.out.println(Math.round(num1 / num2));
     System.out.println(Math.random()); //random spit out random number among 0-1
     System.out.println(Math.max(num1, num2));
     System.out.println(Math.min(num1, num2));
     
     
     
     String [] friends = {"Mike", "Amber", "Lily", "Lydia", "Rose", "Jack"};   // string [] is the symbol of array, is a kind of variable
     friends[3] = "Hope";          // array can store multiple information, and the information can be changed. Also not mention the variable type when changing the value/content of item
     System.out.println(friends[3]);     
     String [] relatives = new String[8];// !!! array can be just with the number of information, and added information at any time
     relatives[0] = "KotoHope";              // String [] x = new String[numberOfElements]
     relatives[1] = "Moon";
     System.out.println(relatives[0]);
     System.out.println(relatives[1]);
     System.out.println(relatives[3]);
     
     sayHi();
     sayhi("Koto", 23);
     
     System.out.println(cube(3));
     System.out.println(yes());
     System.out.println(fightingForFemaleRight());
     
     
     
     boolean is_female = true;  //variable type + name 
     boolean is_smart = true;
     
     if(is_female && is_smart) {      // && means and     || means or    ! means not     
    	 System.out.println("You are a smart female.");
     } else if(!is_female && is_smart) {
    	 System.out.println("You are not a female, but you are smart.");   //if(){}    else if(){}
     } else if(is_female && !is_smart) {
    	 System.out.println("You are a female, and you should learn to be smart.");
     }
     else {             //else{}
    	 System.out.println("You are not a female, and you also need to learn to be smart.");
     }
     
     
     System.out.println(min(3.444, 2333.44, 4232));
     
     System.out.println(dayName(3));
     
     int i = 9;     //define a variable first before using it
     while(i<15) {                  // while(){}   while first and do later
    	 System.out.println(i);
    	 i +=1;    // i=i+1  i++  i+=1
     }
     
     int h = 12;    
     do {                        // do{} while();   the sequence of execution is different    do first and while later
    	 System.out.println(h);   //while loop and do while loop is different in sequence of execution, and the result is a little different
    	 h +=2;
     } while(h<12);
     
     int ii = 5;
     do {
   	 System.out.println(ii);
   	 ii +=3;
    } while(h<5);
     
     
     for(int hh =0; hh < friends.length; hh++) { //for(define a variable; a condition for variable; a increment for every time){operation]
    	 System.out.println(friends[hh]);     //be careful about the two semicolon after the definition and the condition
     }    //be careful about the time the loop can continue   
          // !!!  < is very different from <=
         // friends.length; !!!  maybe because the length here is not the aim, so () after that is not needed
     
     System.out.println(power(5, 6));
     
     int [][] numberGrid = {    //2-dimension array---- type [][] name   // all kinds of array---String, integer, etc
    		 {1, 4, 2, 4,3},
    		 {3, 5},
    		 {0}
     };    // ; after a array    because it is not a method, so it has to be terminated with a semicolon
     System.out.println(numberGrid[2][0]);  //can extract every item in the 2-dimension array accurately
     
     for(int oo = 0;oo < numberGrid.length; oo++) {  //define a new variable with type and give initiative value;
    	   // give condition to loop // give increment for each time
    	 for(int qq = 0; qq < numberGrid[oo].length; qq++) {   //  > x[].length
    	     System.out.println(numberGrid[oo][qq]); 	     
    	 }
    	  System.out.println();  // to put a blank line after each main loop and format a little better
     }
     //nested for loop --- for loop in a for loop, loop each situation/item/element in each situation/item/element
     
     Book book1 = new Book(ii);  //Class objectName = new Class()
     book1.bookName = "Gone With the Wind";   //objectname.function = ""   add specific content to each attribute of object
     book1.author = "Margaret Mitchell";     // String should be added with quotation marks
     book1.category = "survival, growth, independence and love" ;
     book1.pages = 1024;
     book1.meaningful = true;
     book1.famous = true;
     System.out.println(book1.author);
     
     Books book2 = new Books("The Road Less Travelled", "Pack", "Philosophy",252,true,true);
     // still able to define not valid value in the () if the methods are not private
     book2.setCategory("Love");    // x.setCategory("y");    define or change the value in the parenthesis
     System.out.println(book2.getCategory());  //the function of setx is verb, not noun
     // name.setx("");  --- fill out the value and just pass the value to the original attributes
     //setx and getx are both methods/functions, just not attributes that are known
     //System.out.println(name.getx());-----print out the value of original attributes
     
     
     Books book3 = new Books("The Road Less Travelled", "Pack", "Love and Life",252,true,true);
     System.out.println(book3.category);
     
     prints.sayGoodbye();//no need to build a instance and just access to the methods and variables stored in another class
     // just mention the class name and the method name or the variable name you stored in that class
    
     System.out.println(prints.height1);
     
     Lives n1 = new Animals();  //can be categorized in the interface class
     n1.eat();    //call the attribute by dot
     Plants n2 = new Plants();
     n2.death();
     
     Lives [] nnn = {          // interface--- be able to call objects belonging to different classes in the same time
    		 new Animals(),
    		 new Plants(),
    		 new Virus()
     };      // ; for the array  
     for(int mm=0; mm<nnn.length; mm++) {   //for loop---- loop every item   //the int x doesn't matter, just define one int x
    	 nnn[mm].eat();    //no need to write print out when already wrote printout inside the method
     }
     
     
     Friends friend1 = new Friends("Mike", "good at IT and funny", "no need to find", 35);  //more convenient way to add a new object to a class
     System.out.println(friend1.name); //remember to add quotation to contents of string 
     
    
     
     System.out.println(friend1.isYoung());
     
     friend1.weakPoints = "not here now";
     System.out.println(friend1.weakPoints); 
     
     
     Songs song1 = new Songs("Spring", "Matune", 200);
     Songs song2 = new Songs("Summer", "Huxia?", 300);
     song1.setArtist("Matuyama?");
     song1.title ="bbb";
     System.out.println(song1.getArtist()); 
     System.out.println(song1.getSongsCount()); 
     System.out.println(song1.getTitle()); 
     
     
     
     GoodChef c1 = new GoodChef();
     c1.makeDessert();
     c1.makeRice();  //already printed out inside the method, so no need to print it again, just call it
     
     
     
     String q1 = "What color are apples?\na.red\nb.yellow\nc.blue";
     String q2 = "What color are bananas?\na.red\nb.yellow\nc.blue";
     Questions [] questions = {         //Class [] name ---- array of items in specific class
    		 new Questions(q1, "a"),   // actually no need to define a object name---just by new Class(attribute1, attribute2, ...) can call it 
    		 new Questions(q2, "b")	 
     };  
     
     scoreOfQuestions(questions);
     
     
     
     
     
     try {      // try{}catch(Exception/Error/Throwable e){}   in order to make program continue despite exception and error
    	 System.out.println(friends[9]);
     } catch(java.lang.ArrayIndexOutOfBoundsException p) {
    	 System.out.println(p);    //the letter doesn't matter   //System.out.println(letter/"Invalid Input") is a good way to output when there is an error
     } catch(Exception d) {
    	 System.out.println("Invalid Input");
     } catch(Error e) {                              // !! The first letter of error should be capitalized
    	 System.out.println("Invalid Input");
     }catch(Throwable e) {
    	 System.out.println("Invalid Input");
     }
     
     
     
     for(int jj = 1;jj< 7; jj+=2) {       // nested loops-- the kind of loop that there is another loop in a loop
    	 for(int kk =1; kk<3; kk++) {      //each situation of main loop will include all situations of the not main loop
    		 System.out.println("jj = " + jj + "  kk = " + kk);   //be careful about the String of variable and real variable on the console/screen
    		 System.out.println("The result is " + (jj*kk) + ".");  //blank before and after the variable when printing out things
    	 }
     }
     
     
     
     Scanner input = new Scanner(System.in); // Scanner x = new Scanner(System.in) 1 time is ok
        // just put import java.util.Scanner; Scanner x = new Scanner(System.in); before the context is ok
       // Scanner and new are classes
     
     String Word = "giraffe";
     String InputWord = " ";
     int GuessCount = 0;
     int GuessTime = 3;
     boolean outOfGuess = false;
     
     while(!InputWord.equals(Word) && !outOfGuess ) {
    	 if(GuessCount < GuessTime) {
    	 System.out.println("Enter a word: ");
    	 InputWord = input.nextLine();
    	 GuessCount++;                      //the 4th time is not allowed, 3 times is included in this
     } else {
    	 outOfGuess = true;    
     }
    	 }
     if(outOfGuess = true) {
    	 System.out.println("Out of guess. You lose!");   //just two results---right or wrong in 3 times
     } else {
    	 System.out.println("You win!"); 
     }  
     
     
     
     
     
     String word = "giraffe";
     String inputWord = " ";
     int guessCount = 0;
     int guessTime = 3;
     
     
     while(!inputWord.equals(word) && guessCount < guessTime ) {
    	 System.out.println("Enter a word: ");
    	 inputWord = input.nextLine();
    	 guessCount++;
     }
     if(inputWord.equals(word)) {     //also, just 2 kinds of results, 2 kinds of output
    	 System.out.println("You win!");
     } else {
    	 System.out.println("Out of guess. You lose!"); 
     }
     
     
     
     String secretWord = "apple";
     String guess = "";                 //write type name when defining a variable for the first time
     while(!guess.contentEquals(secretWord)) {     
    	 System.out.println("Enter a word: ");
    	 guess = input.nextLine();  //when changing the content of variable, don't write the type again 
     }
    
     System.out.println("You win!");    // !x.equals(y)  not equal to 
        //content in ()   x.contentEquals(y)
     
     
      
      System.out.println("Enter a number: ");
      double b1 = input.nextDouble();  //if it is double, then input nextDouble
      System.out.println("Enter a operation: ");
      String op = input.next(); 
      System.out.println("Enter another number: ");
      double b2 = input.nextDouble(); 
      if(op.equals("+")) {             // .equals()      //!!!input are all Strings!!!
    	  System.out.println(b1 + b2);
      } else if(op.equals("-")) {
    	  System.out.println(b1 - b2);   // if    else if    else
      } else if(op.equals("*")) {
    	  System.out.println(b1 * b2);
      } else if(op.equals("/")) {
    	  System.out.println(b1 / b2);
      } else {
    	  System.out.println("Invalid Input");
      }     
     
     int hello_world = 5;  //insert semicolon
     System.out.println(hello_world);
     
    
     System.out.println("Enter a color: ");
     String color = input.nextLine();
     System.out.println("Enter a plural noun: ");
     String noun = input.nextLine();
     System.out.println("Enter a celebrity: ");
     String celebrity = input.nextLine();
     System.out.println("Rosed are " + color + ".\n"
    		 + noun + " are blue.\n"
    		 + "I like the talent of " + celebrity + ".");
     
     Scanner in = new Scanner(System.in);
     System.out.print("Enter in first number you want to multiply: ");
     double number1 = in.nextDouble();               // () means not known??
     System.out.print("Enter in second number you want to multiply: ");
     double number2 = in.nextDouble();
     System.out.print(number1 * number2 );
     
     
     
     System.out.println("Enter your name:");
     String userName = input.nextLine();
     System.out.print("Enter your age:");
     int userAge = input.nextInt();    // int shouldn't be to upper case alone
     System.out.println("Hey, " + userName + "!" + " You are " + userAge + " years old."); //println can separate line from line before and after
     
     
     
     
   
    
     
     
     //types of variables
             int sky = 6;
    		 double oil = 8.9;
    		 boolean red = true;   
    		 char big = 't';       //char is only for one-letter message
    		          // single quotation mark for char
    		 String dog = "so cute";  // String
    		 System.out.println(sky);
    		 System.out.println(red);
    		 System.out.println(big);
    		 System.out.println(dog);
    		 double deal = oil;       // ;
    				 System.out.println(deal);  // ;
    		 double seal = sky; 
    				 System.out.println(sky);  //double can replace the value of int
    				 // string can not be equal to other kinds of variables
    	
    	int x;
    	x = 7; // variables must be initiated with content
    	   // can not write type of variable again
    	System.out.println(x); // ; must be added for every line
    	int s = 8;
    	int sum = x + s;
    	double d = 9.8;
    	double t = d - s;
    	int w = s / x;  // type of variable is very important
    	double r = s * d;  //double include integer, but integer doesn't include double
    	double a = (d - s) * d;
    	System.out.println(sum);
    	System.out.println(t);
    	System.out.println(w);
    	System.out.println(r);
    	System.out.println(a);
    	double z = Math.pow(x, s); // Math.pow(x, y)
    	System.out.println(z);
    	double b = x / (double)s; // another way to convert types of variables
    	System.out.println(b);
    	int n = s % x; //% means remainder
    	System.out.println(n);
    	
    	Scanner pp = new Scanner(System.in); // Scanner    = new Scanner(System.in);
    	int xx = pp.nextInt();  //" "can be a String
    	int f = pp.nextInt(); // nextInt 
    	boolean e = pp.nextBoolean(); //nextBoolean  true or false
    	double g = pp.nextDouble();  //String, double, int, boolean
    	
    	System.out.println(xx);		
    	
    	Scanner ps = new Scanner(System.in); // Scanner x = new Scanner(System.in);
    	String tt = ps.next(); // String y = x.next();
    	System.out.println(tt);
    	int zz = Integer.parseInt(tt);// int xx = Integer.parseInt(x)   but int = int is the best
    	     // Integer.parseInt --- convert String to integer
    				 
    }
    String x = new String("hello"); //property:store     //void is also a class
    public static void sayHi() {                        //public static void variableName  only when you don't return sth and print the result out directly
    	System.out.println("Hello Mike");   //and just call the method in the main area
    }
    public static void sayhi(String name1, int age1) {   //add parameters in method   //create method apart from the main method and make it used in the main method
    	System.out.println("Hello " + name1 + "! you are " + age1 + " years old!");
    }
    public static int cube(int number2) {   // parameter---type name of variable, and then name of variable
    	// viod should be changed to the variable types you want to use return
    	return number2 * number2 * number2;  //return---a little less than print
    }
    public static String yes() {
    	return "I am a grown-up. I will be stronger and stronger.";  // ; should never be missed
    }
    public static boolean fightingForFemaleRight() {
    	return true;
    }
    public static double min(double a1, double a2, double a3) {
    	if(a1 >= a2 && a1 >= a3 ) {
    		return a1;
    	} else if(a2 >=a1 && a2 >=a3) {
    		return a2;
    	} else {
    		return a3;
    	}
    }

    public static String dayName(int dayNum) {    //no need to put a "," between the type name and name
    	String dayName = "";    //necessary to define a variable before using it in switch loop
    	switch(dayNum) {
    	case 1: dayName = "Monday";   // = is using the variable
    			break;
    	case 2: dayName = "Tuesday";     // !!!!switch(name of variable which is the main role in cases) 
    	                             // !!!{case valueOfVariable: happening in the case; break; default: happening in the case; break; }
    	        break;
    	case 3: dayName = "Wednesday";  //switch loop is more convenient than if loop
    	      break;
    	case 4: dayName = "Thusday";
	      break;
    	case 5: dayName = "Friday";
	      break;
    	case 6: dayName = "Saturday";
	      break;
    	case 7: dayName = "Sunday";
	      break;
	    default: dayName = "Invalid Input";
	    		break;                     //break;   from the beginning to the end
	    		// break; of each case in switch loop is necessary
    	}
    	
    	return dayName;   // return the final variable needed in the result in the end
  
    }
    public static int power(int baseNum, int powerNum) {  //for loop and while loop is best for continuing the process
    	//for loop is more convenient than while loop
    	int result  = 1;      //not modify the powerNum, but build and modify the new result variable
    	for(int pp = 0; pp < powerNum; pp++ ) {
    	result = result * baseNum;	
    	}
    	return result;     //return or print out is necessary
    }
    public static void scoreOfQuestions(Questions [] questions) {
    	Scanner input = new Scanner(System.in);
    	int score = 0;                                     //define the initiative value of result/score first
    	for(int qu = 0; qu < questions.length; qu++) {   //for loop--- in case the questions/contents are too many
    		System.out.println(questions[qu].question); 
    	String answer = input.nextLine();               //
    		if( answer.contentEquals(questions[qu].answer)) {
    			score++;
    		}
    	}
    	System.out.println("You got a score of " + score + "/" + questions.length + ".");
    }
}
  