package tp1.tp1.entities;

import tp1.tp1.functionnalities.Carnivorus;
import tp1.tp1.functionnalities.Eatable;
import tp1.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	System.out.println("This Hyena named "+ this.getName() + " just move Walking");	
}

@Override
public void eat(Eatable eatable) {
	if (eatable instanceof Vegetable) {
		System.out.println("This Hyena named "+ this.getName() + " cannot eat " + ((Vegetable) eatable).getName());
	}
	
	if (eatable instanceof Animal) {
		System.out.println("This Hyena named "+ this.getName() + " just eat " + ((Animal) eatable).getName());
	}	
}
}
