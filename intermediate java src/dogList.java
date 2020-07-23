
public class dogList {

	dog[] list = new dog[7];

	int b = 0;
	
	public void add(dog a) {
		if(b < list.length) {
			list[b]=a;
			System.out.println("new dog added at index " + b);
			b++;
			
		}
	}
	
	
	
}
