public class Main {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal1 = animalFactory.getAnimal("dog");
		animal1.info();
		Animal animal2 = animalFactory.getAnimal("cat");
		animal2.info();
		
	}
}
