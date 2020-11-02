package tp1.tp1.entities;

import tp1.tp1.functionnalities.Eatable;
import tp1.tp1.functionnalities.Omnivorus;
import tp1.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	System.out.println("This Dog named "+ this.getName() + " just move Walking");
	
}

@Override
public void eat(Eatable eatable) {
	if (eatable instanceof Vegetable) {
		System.out.println("This Dog named "+ this.getName() + " just eat " + ((Vegetable) eatable).getName());
	}
	
	if (eatable instanceof Animal) {
		System.out.println("This Dog named "+ this.getName() + " just eat " + ((Animal) eatable).getName());
	}	
}
}
