
public class animalList {

	private animal [] a = new animal[10];
	
	private int b = 0;
	
	public void add(animal c) {
		if(b < a.length) {
			a[b] = c;
			System.out.println("New animal added at index " + b);
			b ++;   //this make sure index increment each time the method is called
		}
	}
	
}
