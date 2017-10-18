
public class AnimalFactory {
	public Animal getAnimal(String animal) {
		if(animal.equals("cat")) {
			return new Cat();
		} else if(animal.equals("dog")) {
			return new Doggy();
		} else {
			return null;
		}
	}

}
