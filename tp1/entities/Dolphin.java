package tp1.tp1.entities;

import tp1.tp1.functionnalities.Aquatic;
import tp1.tp1.functionnalities.Carnivorus;
import tp1.tp1.functionnalities.Eatable;

public class Dolphin extends Animal implements Aquatic, Carnivorus {

  public Dolphin() {
    super();
  }

  public Dolphin(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	System.out.println("This Dolphin named "+ this.getName() + " just move Swiming");
	
}

@Override
public void eat(Eatable eatable) {
	if (eatable instanceof Vegetable) {
		System.out.println("This Dolphin named "+ this.getName() + " cannot eat " + ((Vegetable) eatable).getName());
	}
	
	if (eatable instanceof Animal) {
		System.out.println("This Dolphin named "+ this.getName() + " just eat " + ((Animal) eatable).getName());
	}	
}
}
