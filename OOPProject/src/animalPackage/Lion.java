package animalPackage;

public class Lion extends Animal implements Living {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("I would like to eat meat!");
	}
	
	public void roar() {
		System.out.println("ROARR");
		
	}

	@Override
	public void grow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproduce() {
		// TODO Auto-generated method stub
		System.out.println("I can give you cubs");
	}
}
