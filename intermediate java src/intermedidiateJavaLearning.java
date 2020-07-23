import java.util.*;


public class intermedidiateJavaLearning {
   public static void main(String[] args) {
	   
	   //to create a list of array and add value to it and loop the values in it
	   String[] d = {"chocolate", "cake", "icecream", "cheese", "cookie", "fruit"};
	   List<String> list1 = new ArrayList<String>();   //import java.util.*  first to use List and ArrayList  //use <> to define the type of component
	   
	   for(String e : d)
	     list1.add(e);          //use add method to add value to a list
	   
	   for(int f = 0; f< list1.size(); f++)    //listName.size()   size method means the value in it is mutable and length method means it is immutable?
	     System.out.printf("%s ", list1.get(f));  //listName.get(int) is how a list show its single values
	   
	   System.out.println();
	   
	   String[] g = {"cheese", "icecream"};
	   List<String> list2 = new ArrayList<String> ();     //list doesn't care there is duplicate or not
	   
	   for(String h : g)
	     list2.add(h);
	   
	   for(int i = 0; i < list2.size(); i++)
		   System.out.printf("%s ", list2.get(i));
	   
	   System.out.println();
	   
	   
	   
	   //to delete items which are as same as another list 
	   editList(list1, list2);
	   System.out.println(list1);
	  
	   for(int i = 0; i < list1.size(); i++)
		   System.out.printf("%s ", list1.get(i));
	   
	   System.out.println();
	   
	   
	   //to build linked lists  //linkedList not only has methods of list but also own methods of its own
	   String[] thing = {"pie", "peach", "orange", "stawberry", "cake", "noobs"};
	   List<String> list3 = new LinkedList<String>();
	    
	   for(String j : thing) {
         list3.add(j);
	   }
	   
	   list3.addAll(list1);  //the same as Collections.addAll(list3, list1);
	   list1 = null;
	   
	   printMe(list3);
	   removeStuff(list3, 3, 5);
	   printMe(list3);
	   reverseMe(list3);
	   
	   
	   
	   
	   //starts with method and ends with method and use them in the for loop to pick up certain types of value
	   String [] a = {"furry","funk","chunk","baconator"};
	   
	   for(String b : a) {
		   if(b.startsWith("fu")) {
			   System.out.println(b + " starts with 'fu'");}
		   
	   }
	   
	   for(String b : a) {
		   if(b.endsWith("unk")) {
			   System.out.println(b + " ends with 'unk'");
		   }
	   }
	   
	   //more String methods:  indexOf, replace, trim, concatenate, toUpperCase, toLowerCase
	   String c = " Beaufitul Life";
	   System.out.println(c.indexOf("f"));
	   System.out.println(c.indexOf("f", 6));      //indexOf("x", from which index)
	   System.out.println(c.indexOf("fi")); 
	   System.out.println(c.replace("fe","ves"));   //replace all x1 with x2
	   System.out.println(c.trim());              //trim means trim the notably unnecessary empty space
	   System.out.println(c.concat(" is here"));  //concat means concatenate, equals to + 
	   System.out.println(c + " is here now");
	   System.out.println(c.toUpperCase());    
	   System.out.println(c.toLowerCase());
	   
	   //to use recursion(factorial/long) method to call the method itself again and again until it gets the base case and get factorial result upwards
	   System.out.println(factorial(8));
	   
	   
	   //to convert array into list and convert list into array 
	   String[] stuff = {"watermelon","acavodo","berry", "tomato"};
	   LinkedList<String> list5 = new LinkedList<String>(Arrays.asList(stuff));  //Arrays.asList()  Arrays //<> type of content is always necessary for a list and for a interator
	   
	   list5.add("orange");
	   list5.addFirst("fudge");  //add and addFirst, addLast is methods of list
	   list5.addLast("mango");
	   
	   stuff = list5.toArray(new String[list5.size()]);  //list.toArray(new String/int[list.size()])
	   for(String String: stuff) {
		   System.out.printf("%s ",String);  //enhanced for loop is method of array
		   
		   System.out.println();
		   
	   }
		   
		   
	   //to sort an array in ascending or descending alphabet order by converting it to list  
	   String[] music = {"jazz", "classic", "romantic","blue", "country music"};
	   List<String> music1 = Arrays.asList(music);  // = Arrays.asList()    Arrays  Collections
	   
	   Collections.sort(music1);
	   System.out.printf("%s\n", music1);
	   
	   Collections.sort(music1, Collections.reverseOrder());  
	   System.out.printf("%s\n", music1); 
	   
	   
	   //to use the reverse method and copy method of collections
	   Character[] c1 = {'j', 'p', 'q', 'd'};  //Character is also a type
	   List<Character> c2 = Arrays.asList(c1);
	   System.out.println("This is the original list: ");
	   output(c2);
	   
	   Collections.reverse(c2);
	   System.out.println("This is the list after reversing: ");
	   output(c2);
	   
	   Character[] c3 = new Character[4]; // = new Character[n];
	   List<Character> c4 = Arrays.asList(c3);
	  
	   
	   Collections.copy(c4, c2); //list can only copy list //Collections.copy( newListName, prototypeListName);
	   System.out.println("This is the list after copy: ");
	   output(c4);
	   
	   Collections.fill(c2, 'A');
	   System.out.println("This is the list after filling: ");
	   output(c2);
	   
	   
	   //to use addAll methods of Collection
	  String[] food = {"egg", "shrimp", "bean"};
	  
	  ArrayList<String> l6 = new ArrayList<String>(); //<> of list must be filled
	  
	  l6.add("app");
	  l6.add("platform");
	  l6.add("website");
	  
	  System.out.println("This is the original list: ");
	  for(String s : l6) {
		  System.out.printf("%s ", s);  
	  }
	  System.out.println();
	  
	  Collections.addAll(l6, food);  //WE CAN ADD ARRAY TO LIST
	  
	  System.out.println("This is the list after using the Collections addAll method: ");
	  for(String s : l6) {
		  System.out.printf("%s ", s);  
	  }
	  System.out.println();
	  
	  //to use frequency method to check the frequency of an item in a list and use disjoint method to check if the lists do not have something in commmon
	  System.out.println(Collections.frequency(l6, "shrimp"));
	  
	  boolean tof = Collections.disjoint(c4, c2);   //make a boolean of Collection.disjoint()
	  System.out.println(tof);
	  if(tof) {
		  System.out.println("The lists do not have something in common");
	  }else {
		  System.out.println("The lists have something in common!");
	  }
	  
	  //to build a stack and push things into it, pop things out of it, and print it out 
	  Stack<String> house = new Stack<String>();
	  
	  house.push("bedroom");
	  printStack(house);
	  
	  house.push("kitchen");
	  printStack(house);
	  
	  house.push("bathroom");
	  printStack(house);
	  
	  house.pop();  //pop the top one of it by StackObject.pop();
	  printStack(house);
	  
	  house.pop();  
	  printStack(house);
	  
	  house.pop();  
	  printStack(house);
	  
	  
	  //to build a PriorityQueue and offer items to it and peek at the first item offered and poll the first item out from it--- opposite to stack
	  PriorityQueue<String> q = new PriorityQueue<String> ();
	  
	  q.offer("first"); //offer one item at one time
	  q.offer("second");
	  q.offer("third");
	  
	  System.out.println(q.peek());
	  System.out.println(q);
	  
	  q.poll();
	  
	  System.out.println(q.peek());
	  System.out.println(q);
	  
	  //to convert a list into a set or HashSet that removes duplicate items automatically
	  List<String> l7 = new ArrayList<String> ();  //new ArrayList<> () is a must?
	  
	  l7.add("bob");
	  l7.add("jack");
	  l7.add("rose");
	  l7.add("bob");
	  
	  System.out.println(l7);
	  
	  Set set = new HashSet(l7);
	  System.out.println(set);
	  
	  //to use generic data type and avoid overloaded type
	  Character[] c11 = {'c','v','b'};
	  Integer[] i1 = {3, 45, 5,5,6,6};  //Integer[] ?? 
	  
	  print(c11);
	  print(i1);
	  
	  
	  //to use generic return type
	  System.out.println(max(1, 6, 8));
	  System.out.println(max("apple", "banana", "orange"));  //still need to be the same kind of variable type
	 
	  
	  
   }
   
   //factorial method
   public static long factorial(int n) {   //factorial means time all the integer number below it
	   if(n <= 1) {
		   return 1;   //this is the base case  //long needs to return something
	   }else {
		   return n * factorial(n-1);  //call the method itself again and again and store the information until get to the base case and start to get the result with the information
	   }
   }
   
   
   //the method which remove list items that is the same as obejcts of another list 
   public static void editList(Collection<String> l1, Collection<String> l2 ) {  //Collection<> name1 
	   Iterator<String> it = l1.iterator();      //Iterator<> name3 = CollectionObject.iterator();  //Iterator means single item that Collection loops through
	   while(it.hasNext()) {             //IteratorObject.hasNext()
		   if(l2.contains(it.next()))  //Collection.contains(IteratorObject.next())  contains
			   it.remove();    //IteratorObject.remove();	   
	   }   
	   
   }
   
   //print list method
   private static void printMe(List<String> l) {
	   for(String h : l) {
       System.out.printf("%s ", h);
       
	   }
	   System.out.println();
   }
   
   //remove stuff from lists
   private static void removeStuff(List<String> l, int m, int n) {
	   l.subList(m, n).clear();
   }
   
   //to print out items of list in a reverse sequence
   private static void reverseMe(List<String> l) {
	   ListIterator<String> it = l.listIterator(l.size());  //ListIterator<String/int> name   list.iterator(list.size())  
	   while(it.hasPrevious()) {
		   System.out.printf("%s ", it.previous());  
	   }
	   System.out.println();
   }
   
   //to print out the item of list
   private static void output(List<Character> l) {
	   for(int x =0; x <l.size();x++) {
		   System.out.printf(l.get(x) + "\t");  // or for(Character x : l){System.out.printf(x );   
	   }
	 System.out.println();   //System.out.println(); always make the layout more neat but remember not to to it inside the for loop but inside the void and outside the fot loop
   }
   
   
   //to print out stack
   private static void printStack(Stack<String> s) {
	   if(s.isEmpty()) {
		   System.out.println("There is nothing in this stack");
	   }else {
		   System.out.println(s);  //we can print out the stack directly
	   }
   }
   
   //to use generic data type to build method for all kinds of parameter
   public static <T> void print(T[] x) { //static <T> void is a must!
	   for(T b : x) {
		   System.out.printf("%s ", b);	   
	   }
	   System.out.println();
   }
   
   //to build a method using the generic return type     //static <T extends Comparable<T>> T methodName(T x, T z){  return y }
   public static <T extends Comparable<T>> T max(T x, T y, T z){  //we need the method name!!
	   	T m = x;
	   	
	   	if(y.compareTo(m) > 0)   //x.compareTo(y) > 0
	     m = y;
	   	if(z.compareTo(m) > 0)
	     m = z;
	   	
	   	return m;
   }
   
   
}
