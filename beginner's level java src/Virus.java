
public class Virus implements Lives{

	@Override
	public void eat() {
		System.out.println("eat cells of animals and plants");
		
	}

	@Override
	public void grow() {
		System.out.println("grow endlessly");
		
	}

	@Override
	public void death() {
		System.out.println("die when the structure is destroyed");
		
	}

}
