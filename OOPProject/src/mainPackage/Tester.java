package mainPackage;

import animalPackage.Lion;
import animalPackage.Panda;
import animalPackage.Tree;
import employeePackage.Developer;
import employeePackage.Employee;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Moto");
		Employee zainab = new Employee("zainab@dojotech.com", 250_000);
		zainab.empDetails();
		
		Developer Sarah = new Developer ("sarah@dojotech.com", 250000, "World Hunger");
		Sarah.devDetails();
		
		Lion simba = new Lion();
		simba.breath();
		simba.eat();
		simba.roar();
		simba.reproduce();
		
		Panda pho = new Panda();
		pho.breath();
		pho.climbTree();
		
		Tree newTree = new Tree();
		newTree.grow();
	}

}
