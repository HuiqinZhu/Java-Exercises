
public class Book {
String bookName;   //define a class and all its attributes/functions/methods
String author;    // new attributes should be defined based on old attributes like String and integer etc
String category;
int pages;
boolean meaningful;
boolean famous;
private final int number;
int sum;

public Book(int number) {
	this.number = number;
}

public void add() {
	sum += number;
}

public String toString() {
	return String.format("sum = %d", sum);  //String is to return things //toString String is to return String.format( , )
}

}
