import Another.ground;
public class Animals implements Lives{   //just add 2 characters: implements x

	@Override
	public void eat() {
		System.out.println("eat other animals, plants and water");
		
	}

	@Override
	public void grow() {
		System.out.println("grow to a certain size");
		
	}

	@Override
	public void death() {
		System.out.println("die until certain years");
		
	}

}
