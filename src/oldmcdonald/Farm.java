package oldmcdonald;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	public static void main(String[] args) {
		Cow cow = new Cow();
		// System.out.println(cow.getType() + " goes " + cow.getSound());

		// do same for chick and pig

		List<Animal> myFarm = new ArrayList<Animal>();
		NamedCow namedCow = new NamedCow("Betsie");
		myFarm.add(cow);
		myFarm.add(namedCow);

		animalSounds(myFarm);

	}

	public static void animalSounds(List<Animal> farm) {
		Animal currentAnimal;
		for (int i = 0; i < farm.size(); i++) {
			currentAnimal = farm.get(i);
			System.out.println(currentAnimal.getType() + " goes " + currentAnimal.getSound());
		}
	}
}
