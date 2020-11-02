package tp1.tp1.entities;

import tp1.tp1.functionnalities.Eatable;
import tp1.tp1.functionnalities.Omnivorus;
import tp1.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }

@Override
public void move() {
	System.out.println("This Turtle named "+ this.getName() + " just move Walking or Swiming");
	
}

@Override
public void eat(Eatable eatable) {
	if (eatable instanceof Vegetable) {
		System.out.println("This Turtle named "+ this.getName() + " just eat " + ((Vegetable) eatable).getName());
	}
	
	if (eatable instanceof Animal) {
		System.out.println("This Turtle named "+ this.getName() + " just eat " + ((Animal) eatable).getName());
	}	
}
}
